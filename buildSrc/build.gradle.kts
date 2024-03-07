plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

dependencies {
    // Sans cette ligne, le fichier `ProjectExt.kt` ne compile pas et cela nous empêche d'utiliser les déclarations
    // de dépendances partagées dans les fichiers de conventions Gradle. Voir https://github.com/gradle/gradle/issues/15383.
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    implementation(libs.kotlinGradlePlugin)
}
