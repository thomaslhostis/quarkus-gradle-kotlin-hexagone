plugins {
    kotlin("jvm")
    id("io.quarkus")
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone.core"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(project(":core:application"))
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson:${quarkusPlatformVersion}")
    implementation("io.quarkus:quarkus-resteasy-reactive:${quarkusPlatformVersion}")
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
}
