data class Dependency(
    val group: String,
    val name: String,
    val version: String? = null
) {
    val id: String = "$group:$name"

    private val notation: String = if (version == null) id else "$id:$version"

    fun notation(version: String? = null): String {
        return if (version == null) notation else "$id:$version"
    }

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
