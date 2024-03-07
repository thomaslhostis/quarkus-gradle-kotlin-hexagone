plugins {
    kotlin("jvm")
}

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
    implementation(enforcedPlatform(libs.quarkusBom))
    implementation(libs.jakartaCdiApi)
}
