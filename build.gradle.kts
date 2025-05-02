plugins {
    id("java")
}

group = "ru.netologia.qamid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.1.0")
}

tasks.test {
    useTestNG()
}