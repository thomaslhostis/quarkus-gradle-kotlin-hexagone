pluginManagement {
    val kotlinVersion: String by settings
    val quarkusVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        id("io.quarkus") version quarkusVersion
    }
}

rootProject.name = "quarkus-gradle-kotlin-hexagone"

include(
    "core:presentation",
    "core:application",
    "core:domain",
    "core:infrastructure"
)
