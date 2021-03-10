data class Dependency(
    val group: String,
    val name: String,
    val version: String? = null
) {
    val id: String = "$group:$name"

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

    override fun toString(): String {
        return if (version == null) id else "$id:$version"
    }
}
