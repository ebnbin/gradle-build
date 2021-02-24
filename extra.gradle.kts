rootProject.extra["versionMap"] = mapOf(
    "compileSdkVersion" to "30", // https://developer.android.com/studio/releases/platforms
    "minSdkVersion" to "21",
    "targetSdkVersion" to "30"
)
rootProject.extra["dependencyMap"] = mapOf(
    "com.android.tools.build:gradle" to "4.0.2", // https://developer.android.com/studio/releases/gradle-plugin https://maven.google.com/web/index.html
    "org.jetbrains.kotlin:kotlin-gradle-plugin" to "1.4.30", // https://github.com/jetbrains/kotlin
    "androidx.core:core-ktx" to "1.3.2", // https://developer.android.com/jetpack/androidx/versions
    "androidx.appcompat:appcompat" to "1.2.0",
    "androidx.annotation:annotation" to "1.1.0",
    "androidx.lifecycle:lifecycle-viewmodel-ktx" to "2.3.0",
    "androidx.lifecycle:lifecycle-livedata-ktx" to "2.3.0",
    "androidx.activity:activity-ktx" to "1.2.0",
    "androidx.fragment:fragment-ktx" to "1.2.5",
    "androidx.constraintlayout:constraintlayout" to "2.0.4",
    "androidx.recyclerview:recyclerview" to "1.1.0",
    "androidx.cardview:cardview" to "1.0.0",
    "androidx.viewpager2:viewpager2" to "1.0.0",
    "com.google.android.material:material" to "1.3.0" // https://github.com/material-components/material-components-android https://material.io/develop/android/docs/getting-started
)
