import org.gradle.api.Project

data class DevDependency(
    val name: String,
    val version: String? = null
) {
    val group: String = "com.github.ebnbin"

    val id: String = "$group:$name"

    val notation: String = if (version == null) id else "$id:$version"

    fun devNotation(project: Project, version: String? = null): Any {
        return if (project.rootProject.localProperties()["dev.publish"] != "false") {
            if (version == null) notation else "$id:$version"
        } else {
            project.project(":$name")
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as DevDependency
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
