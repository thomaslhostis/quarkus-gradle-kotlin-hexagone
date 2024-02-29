pluginManagement {
    val kotlinVersion: String by settings
    val quarkusVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        id("io.quarkus") version quarkusVersion
        id("org.kordamp.gradle.jandex") version "1.0.0"
    }
}

//plugins {
//    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
//}

rootProject.name = "quarkus-gradle-kotlin-hexagone"

include(
    "bootstrap",
    "core:presentation",
    "core:application",
    "core:domain",
    "core:infrastructure"
)
