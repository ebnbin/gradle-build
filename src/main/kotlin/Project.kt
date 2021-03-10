import org.gradle.api.Project
import org.gradle.kotlin.dsl.extra
import java.io.File
import java.util.Properties

fun Project.localProperties(): Properties {
    val properties = Properties()
    File(rootDir, "local.properties")
        .takeIf { it.isFile }
        ?.let { properties.load(it.reader()) }
    return properties
}

fun Project.hasLocalProperty(key: String): Boolean {
    return localProperties().containsKey(key)
}

fun Project.getLocalProperty(key: String): String? {
    return localProperties().getProperty(key)
}

fun Project.requireLocalProperty(key: String): String {
    return requireNotNull(getLocalProperty(key))
}

fun Project.getLocalPropertyOrDefault(key: String, defaultValue: String): String {
    return localProperties().getProperty(key, defaultValue)
}

fun Project.extras(): MutableMap<String, Any?> {
    return extra.properties
}

fun Project.hasExtra(key: String): Boolean {
    return extras().containsKey(key)
}

inline fun <reified T : Any> Project.getExtra(key: String): T? {
    return extras()[key] as T?
}

inline fun <reified T : Any> Project.requireExtra(key: String): T {
    return extras().getValue(key) as T
}

inline fun <reified T : Any> Project.getExtraOrDefault(key: String, defaultValue: T): T {
    return extras().getOrDefault(key, defaultValue) as T
}

fun Project.getStringExtra(key: String): String? {
    return getExtra(key)
}

fun Project.requireStringExtra(key: String): String {
    return requireExtra(key)
}

fun Project.getStringExtraOrDefault(key: String, defaultValue: String): String {
    return getExtraOrDefault(key, defaultValue)
}
