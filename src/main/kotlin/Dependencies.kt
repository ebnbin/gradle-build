object Dependencies {
    val comGithubDevEbnbin_eb = DevDependency("eb")
    val comGithubDevEbnbin_ebui = DevDependency("ebui")
    val comGithubDevEbnbin_ebdev = DevDependency("ebdev")
    val comGithubDevEbnbin_openmojiPicker = DevDependency("openmoji-picker")

    // https://developer.android.com/jetpack/androidx/versions
    // https://maven.google.com/web/index.html
    val androidxActivity_activityCompose = DefaultDependency(
        id = "androidx.activity:activity-compose",
        version = "1.3.0-alpha05"
    )
    val androidxAnnotation_annotation = DefaultDependency(
        id = "androidx.annotation:annotation",
        version = "1.2.0"
    )
    val androidxAppcompat_appcompat = DefaultDependency(
        id = "androidx.appcompat:appcompat",
        version = "1.2.0"
    )
    val androidxCardview_cardview = DefaultDependency(
        id = "androidx.cardview:cardview",
        version = "1.0.0"
    )
    val androidxCollection_collectionKtx = DefaultDependency(
        id = "androidx.collection:collection-ktx",
        version = "1.1.0"
    )
    val androidxComposeMaterial_material = DefaultDependency(
        id = "androidx.compose.material:material",
        version = Versions.compose
    )
    val androidxComposeMaterial_materialIconsExtended = DefaultDependency(
        id = "androidx.compose.material:material-icons-extended",
        version = Versions.compose
    )
    val androidxComposeRuntime_runtimeLivedata = DefaultDependency(
        id = "androidx.compose.runtime:runtime-livedata",
        version = Versions.compose
    )
    val androidxConstraintlayout_constraintlayout = DefaultDependency(
        id = "androidx.constraintlayout:constraintlayout",
        version = "2.0.4"
    )
    val androidxCoordinatorlayout_coordinatorlayout = DefaultDependency(
        id = "androidx.coordinatorlayout:coordinatorlayout",
        version = "1.1.0"
    )
    val androidxCore_coreKtx = DefaultDependency(
        id = "androidx.core:core-ktx",
        version = "1.3.2"
    )
    val androidxFragment_fragmentKtx = DefaultDependency(
        id = "androidx.fragment:fragment-ktx",
        version = "1.3.2"
    )
    val androidxGridlayout_gridlayout = DefaultDependency(
        id = "androidx.gridlayout:gridlayout",
        version = "1.0.0"
    )
    val androidxLifecycle_lifecycleLivedataKtx = DefaultDependency(
        id = "androidx.lifecycle:lifecycle-livedata-ktx",
        version = "2.3.1"
    )
    val androidxLifecycle_lifecycleViewmodelCompose = DefaultDependency(
        id = "androidx.lifecycle:lifecycle-viewmodel-compose",
        version = "1.0.0-alpha03"
    )
    val androidxLifecycle_lifecycleViewmodelKtx = DefaultDependency(
        id = "androidx.lifecycle:lifecycle-viewmodel-ktx",
        version = "2.3.1"
    )
    val androidxPreference_preferenceKtx = DefaultDependency(
        id = "androidx.preference:preference-ktx",
        version = "1.1.1"
    )
    val androidxRecyclerview_recyclerview = DefaultDependency(
        id = "androidx.recyclerview:recyclerview",
        version = "1.1.0"
    )
    val androidxRoom_roomCompiler = DefaultDependency(
        id = "androidx.room:room-compiler",
        version = "2.2.6"
    )
    val androidxRoom_roomKtx = DefaultDependency(
        id = "androidx.room:room-ktx",
        version = "2.2.6"
    )
    val androidxSwiperefreshlayout_swiperefreshlayout = DefaultDependency(
        id = "androidx.swiperefreshlayout:swiperefreshlayout",
        version = "1.1.0"
    )
    val androidxViewpager2_viewpager2 = DefaultDependency(
        id = "androidx.viewpager2:viewpager2",
        version = "1.0.0"
    )

    // https://github.com/Ereza/CustomActivityOnCrash
    val catEreza_customactivityoncrash = DefaultDependency(
        id = "cat.ereza:customactivityoncrash",
        version = "2.3.0"
    )

    // https://developer.android.com/studio/releases/gradle-plugin
    // https://androidstudio.googleblog.com/
    // https://maven.google.com/web/index.html
    val comAndroidToolsBuild_gradle = DefaultDependency(
        id = "com.android.tools.build:gradle",
        version = "7.0.0-alpha12"
    )

    // https://github.com/bumptech/glide
    val comGithubBumptechGlide_glide = DefaultDependency(
        id = "com.github.bumptech.glide:glide",
        version = "4.12.0"
    )

    // https://github.com/material-components/material-components-android
    // https://maven.google.com/web/index.html
    val comGoogleAndroidMaterial_material = DefaultDependency(
        id = "com.google.android.material:material",
        version = "1.3.0"
    )

    // https://github.com/google/gson
    val comGoogleCodeGson_gson = DefaultDependency(
        id = "com.google.code.gson:gson",
        version = "2.8.6"
    )

    // https://github.com/square/leakcanary
    val comSquareupLeakcanary_leakcanaryAndroid = DefaultDependency(
        id = "com.squareup.leakcanary:leakcanary-android",
        version = "2.7"
    )

    // https://github.com/jetbrains/kotlin
    val orgJetbrainsKotlin_kotlinGradlePlugin = DefaultDependency(
        id = "org.jetbrains.kotlin:kotlin-gradle-plugin",
        version = "1.4.31"
    )

    // https://github.com/Kotlin/kotlinx.coroutines
    val orgJetbrainsKotlinx_kotlinxCoroutinesAndroid = DefaultDependency(
        id = "org.jetbrains.kotlinx:kotlinx-coroutines-android",
        version = "1.4.3"
    )
}
