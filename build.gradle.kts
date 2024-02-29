plugins {
    kotlin("jvm") version "1.9.22" apply false
    kotlin("plugin.allopen") version "1.9.22"
    id("io.quarkus") apply false
}

group = "com.thomaslhostis"
version = "1.0-SNAPSHOT"

allprojects {
//    apply {
//        plugin("kotlin")
//    }
}

subprojects {
    apply {
        plugin("kotlin")
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
        kotlinOptions.javaParameters = true
    }
}

//java {
//    sourceCompatibility = JavaVersion.VERSION_17
//    targetCompatibility = JavaVersion.VERSION_17
//}

//repositories {
//    mavenCentral()
//    mavenLocal()
//}
//
//val quarkusPlatformGroupId: String by project
//val quarkusPlatformArtifactId: String by project
//val quarkusPlatformVersion: String by project
//
//dependencies {
//    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
//    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
//    implementation("io.quarkus:quarkus-resteasy-reactive")
//    implementation("io.quarkus:quarkus-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation("io.quarkus:quarkus-arc")
//    testImplementation("io.quarkus:quarkus-junit5")
//    testImplementation("io.rest-assured:rest-assured")
//}
//
//
//
//tasks.withType<Test> {
//    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
//}
//allOpen {
//    annotation("jakarta.ws.rs.Path")
//    annotation("jakarta.enterprise.context.ApplicationScoped")
//    annotation("jakarta.persistence.Entity")
//    annotation("io.quarkus.test.junit.QuarkusTest")
//}
//
