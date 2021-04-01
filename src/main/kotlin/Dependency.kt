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

class DefaultDependency(
    override val id: String,
    private val version: String
) : Dependency() {
    fun notation(version: String = this.version): String {
        return "$id:$version"
    }
}

class DevDependency(private val name: String) : Dependency() {
    override val id: String = "com.github.dev-ebnbin:$name"

    fun notation(project: Project, version: String): Any {
        return if (project.rootProject.getLocalProperty("dev.publish") != "false") {
            "$id:$version"
        } else {
            project.project(":$name")
        }
    }
}
