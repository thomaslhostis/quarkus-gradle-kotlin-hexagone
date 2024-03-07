plugins {
    id("quarkus-gradle-kotlin-hexagone.kotlin-application-conventions")
}

dependencies {
    implementation(project(":core:application"))

    implementation(libs.quarkusResteasyReactive)
    implementation(libs.quarkusResteasyReactiveJackson)
}
