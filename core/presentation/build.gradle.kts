group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.allopen") version "1.9.22"
    id("io.quarkus")
}

quarkus {
    version = "2.7.0.Final"
    // Configuration spécifique à ce module
}

dependencies {
    implementation("io.quarkus:quarkus-resteasy:3.8.0")
    // Autres dépendances spécifiques à ce module
}
