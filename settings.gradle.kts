rootProject.name = "quarkus-gradle-kotlin-hexagone"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("gradle.libs.versions.toml"))
        }
    }
}

include(
    "bootstrap",
    "core:presentation",
    "core:application",
    "core:domain",
    "core:infrastructure"
)
