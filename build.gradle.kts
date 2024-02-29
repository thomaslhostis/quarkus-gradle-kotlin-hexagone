plugins {
    kotlin("jvm") apply false
    id("org.kordamp.gradle.jandex")
}

group = "com.thomaslhostis"
version = "1.0-SNAPSHOT"

subprojects {// Essayer conventions
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
        kotlinOptions.javaParameters = true
    }

    repositories {
        mavenLocal()
        mavenCentral()
    }

    apply {
        plugin("kotlin")
    }

    dependencies {
        val quarkusVersion: String by project
        implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))
        implementation("jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1")
    }
}
