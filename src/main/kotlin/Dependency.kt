import org.gradle.api.Project

sealed class Dependency {
    abstract val id: String

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Dependency
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}

open class DefaultDependency(
    final override val id: String,
    version: String
) : Dependency() {
    private val notation: String = "$id:$version"

    fun notation(version: String? = null): String {
        return if (version == null) notation else "$id:$version"
    }
}

class ComposeDependency(
    id: String,
    composeVersion: String,
    version: String = composeVersion
) : DefaultDependency(id, version) {
    private val composeNotation: String = "$id:$composeVersion"

    fun composeNotation(composeVersion: String? = null): String {
        return if (composeVersion == null) composeNotation else "$id:$composeVersion"
    }
}

class DevDependency(
    private val name: String,
    version: String
) : Dependency() {
    override val id: String = "com.github.dev-ebnbin:$name"

    private val notation: String = "$id:$version"

    fun devNotation(project: Project, version: String? = null): Any {
        return if (project.rootProject.getLocalProperty("dev.publish") != "false") {
            if (version == null) notation else "$id:$version"
        } else {
            project.project(":$name")
        }
    }
}
