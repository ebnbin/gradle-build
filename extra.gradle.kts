rootProject.extra["versionMap"] = mapOf(
    "compileSdkVersion" to "30", // https://developer.android.com/studio/releases/platforms
    "minSdkVersion" to "21",
    "targetSdkVersion" to "30"
)

rootProject.extra["dependencyMap"] = mapOf(
    "com.android.tools.build:gradle" to "4.0.2", // https://developer.android.com/studio/releases/gradle-plugin https://maven.google.com/web/index.html
    "org.jetbrains.kotlin:kotlin-gradle-plugin" to "1.4.31", // https://github.com/jetbrains/kotlin
    "org.jetbrains.kotlinx:kotlinx-coroutines-android" to "1.4.2", // https://github.com/Kotlin/kotlinx.coroutines
    "androidx.core:core-ktx" to "1.3.2", // https://developer.android.com/jetpack/androidx/versions
    "androidx.appcompat:appcompat" to "1.2.0",
    "androidx.activity:activity-ktx" to "1.2.0",
    "androidx.fragment:fragment-ktx" to "1.3.0",
    "androidx.lifecycle:lifecycle-viewmodel-ktx" to "2.3.0",
    "androidx.lifecycle:lifecycle-livedata-ktx" to "2.3.0",
    "androidx.annotation:annotation" to "1.1.0",
    "androidx.collection:collection-ktx" to "1.1.0",
    "androidx.preference:preference-ktx" to "1.1.1",
    "androidx.constraintlayout:constraintlayout" to "2.0.4",
    "androidx.coordinatorlayout:coordinatorlayout" to "1.1.0",
    "androidx.recyclerview:recyclerview" to "1.1.0",
    "androidx.swiperefreshlayout:swiperefreshlayout" to "1.1.0",
    "androidx.viewpager2:viewpager2" to "1.0.0",
    "androidx.cardview:cardview" to "1.0.0",
    "androidx.gridlayout:gridlayout" to "1.0.0",
    "androidx.room:room-ktx" to "2.2.6",
    "androidx.room:room-compiler" to "2.2.6",
    "com.google.android.material:material" to "1.3.0", // https://github.com/material-components/material-components-android https://material.io/develop/android/docs/getting-started
    "com.google.code.gson:gson" to "2.8.6", // https://github.com/google/gson
    "com.github.bumptech.glide:glide" to "4.12.0", // https://github.com/bumptech/glide
    "com.squareup.leakcanary:leakcanary-android" to "2.6", // https://github.com/square/leakcanary
    "cat.ereza:customactivityoncrash" to "2.3.0" // https://github.com/Ereza/CustomActivityOnCrash
)
