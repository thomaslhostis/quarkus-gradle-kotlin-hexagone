plugins {
    id("quarkus-gradle-kotlin-hexagone.kotlin-application-conventions")
    alias(libs.plugins.quarkus)
}

dependencies {
    implementation(project(":core:presentation"))
    implementation(project(":core:infrastructure"))

    implementation(libs.quarkusCore)
}
