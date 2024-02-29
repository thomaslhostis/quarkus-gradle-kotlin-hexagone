group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

val quarkusVersion: String by project

dependencies {
    // Utilisation de `api` au lieu de `implementation` pour que le module
    // `presentation` bénéficie de la dépendance transitive vers le module `domain`
    api(project(":core:domain"))
}
