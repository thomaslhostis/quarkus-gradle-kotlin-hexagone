plugins {
    id("io.quarkus")
}

group = "com.thomaslhostis.quarkusgradlekotlinhexagone"
version = "1.0-SNAPSHOT"

dependencies {
    // https://mvnrepository.com/artifact/io.quarkus/quarkus-core
    implementation("io.quarkus:quarkus-core:3.8.0")
    api(project(":core:presentation"))
    api(project(":core:infrastructure"))
}
