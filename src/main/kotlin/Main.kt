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

fun Project.extraProperties(): MutableMap<String, Any?> {
    return extra.properties
}
