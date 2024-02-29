plugins {
    id("io.quarkus")
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":core:presentation"))
    implementation(project(":core:infrastructure"))

    val quarkusVersion: String by project
    implementation("io.quarkus:quarkus-core:${quarkusVersion}")
}
