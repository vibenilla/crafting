plugins {
    java
}

group = "rocks.minestom"
version = "0.1.0"

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("net.minestom:minestom:2026.01.08-1.21.11")
    compileOnly("it.unimi.dsi:fastutil:8.5.18")

    // Unit testing
    testImplementation("net.minestom:minestom:2026.01.08-1.21.11")
    testImplementation("it.unimi.dsi:fastutil:8.5.18")
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.4")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.4")
}

tasks.test {
    useJUnitPlatform()
}