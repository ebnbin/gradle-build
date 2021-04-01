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

class DevDependency(private val name: String) : Dependency() {
    override val id: String = "com.github.dev-ebnbin:$name"

    fun devNotation(project: Project, version: String): Any {
        return if (project.rootProject.getLocalProperty("dev.publish") != "false") {
            "$id:$version"
        } else {
            project.project(":$name")
        }
    }
}
