plugins {
    id("org.kordamp.gradle.jandex") version "1.0.0"
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":core:application"))
    implementation("jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1")
}
