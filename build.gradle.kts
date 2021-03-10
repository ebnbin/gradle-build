plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    jcenter()
}

publishing {
    publications {
        create<MavenPublication>("java") {
            from(components["java"])
        }
    }
}
