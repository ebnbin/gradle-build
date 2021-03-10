package dev.ebnbin.gradlebuild

import org.gradle.api.Project
import java.io.File
import java.util.Properties

fun Project.localProperties2(): Properties {
    val properties = Properties()
    File(rootDir, "local.properties")
        .takeIf { it.isFile }
        ?.let { properties.load(it.reader()) }
    return properties
}

object Main2 {
    fun main2(): Int {
        return 0
    }
}
