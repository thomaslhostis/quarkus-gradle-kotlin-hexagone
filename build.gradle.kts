plugins {
    kotlin("jvm") apply false
}

group = "com.thomaslhostis"
version = "1.0-SNAPSHOT"

subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
        kotlinOptions.javaParameters = true
    }
}
