plugins {
    id("quarkus-gradle-kotlin-hexagone.kotlin-application-conventions")
    alias(libs.plugins.jandex)
}

dependencies {
    implementation(project(":core:application"))

    implementation(libs.quarkusResteasyReactive)
    implementation(libs.quarkusResteasyReactiveJackson)
}
