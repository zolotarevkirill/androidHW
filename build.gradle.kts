plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("Lesson2HW1Kt")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
} 