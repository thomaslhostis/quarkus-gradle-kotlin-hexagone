plugins {
    id("quarkus-gradle-kotlin-hexagone.kotlin-application-conventions")
    alias(libs.plugins.jandex)
}

dependencies {
    // On utilise `api` au lieu de `implementation` pour
    // que le module `presentation` bénéficie de la
    // dépendance transitive vers le module `domain`
    api(project(":core:domain"))
}
