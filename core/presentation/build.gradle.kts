plugins {
    kotlin("jvm")
    id("io.quarkus")
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val quarkusVersion: String by project

dependencies {
    implementation(project(":core:application"))
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson:${quarkusVersion}")
    implementation("io.quarkus:quarkus-resteasy-reactive:${quarkusVersion}")
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))
}
