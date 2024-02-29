plugins {
    id("org.kordamp.gradle.jandex") version "1.0.0"
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

val quarkusVersion: String by project

dependencies {
    // Utilisation de `api` au lieu de `implementation` pour que le
    // module `presentation` bénéficie de la dépendance transitive
    api(project(":core:domain"))

    implementation("jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1")
}
