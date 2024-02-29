plugins {
    kotlin("jvm") apply false
    id("java")
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

    val quarkusVersion: String by project

    dependencies {
        implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))
    }
}


//dependencies {
//    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))
//}
