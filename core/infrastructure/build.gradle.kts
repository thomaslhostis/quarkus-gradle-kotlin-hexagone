plugins {
    id("quarkus-gradle-kotlin-hexagone.kotlin-application-conventions")
    alias(libs.plugins.jandex)
}

dependencies {
    implementation(project(":core:domain"))
}
