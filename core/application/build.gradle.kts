plugins {
    kotlin("jvm")
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

dependencies {
    // Utilisation de `api` au lieu de `implementation` pour que le
    // module `presentation` bénéficie de la dépendance transitive
    api(project(":core:domain"))
}
