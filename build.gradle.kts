import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.51"
}

group = "rocks.intelligence"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("no.tornado:tornadofx:1.7.16")
    compile("com.thizzer.jtouchbar:jtouchbar:0.1.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}