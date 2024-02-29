plugins {
    id("org.kordamp.gradle.jandex") version "1.0.0"
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

val quarkusVersion: String by project

dependencies {
    implementation(project(":core:application"))

    implementation("io.quarkus:quarkus-resteasy-reactive-jackson:${quarkusVersion}")
    implementation("io.quarkus:quarkus-resteasy-reactive:${quarkusVersion}")
}
