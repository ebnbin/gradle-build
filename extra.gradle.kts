rootProject.extra["versionMap"] = mapOf(
    "compileSdkVersion" to "30",
    "minSdkVersion" to "21",
    "targetSdkVersion" to "30"
)
rootProject.extra["dependencyMap"] = mapOf(
    "com.android.tools.build:gradle" to "4.0.2", // https://developer.android.com/studio/releases/gradle-plugin https://maven.google.com/web/index.html
    "org.jetbrains.kotlin:kotlin-gradle-plugin" to "1.4.30", // https://github.com/jetbrains/kotlin
    "androidx.core:core-ktx" to "1.3.2", // https://developer.android.com/jetpack/androidx/versions
    "androidx.recyclerview:recyclerview" to "1.1.0",
    "com.google.android.material:material" to "1.3.0" // https://github.com/material-components/material-components-android https://material.io/develop/android/docs/getting-started
)
