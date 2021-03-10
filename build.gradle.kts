plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    jcenter()
}

publishing {
    publications {
        create<MavenPublication>("kotlin") {
            from(components["kotlin"])
        }
    }
}
