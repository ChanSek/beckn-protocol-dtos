import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.9.0"
  kotlin("plugin.serialization") version "1.9.0"
  id("maven-publish")
}

group = "io.chanse.ondc"
version = "0.0.3"

buildscript {
  repositories { mavenCentral() }

  dependencies {
    val kotlinVersion = "1.9.0"
    classpath(kotlin("gradle-plugin", version = kotlinVersion))
    classpath(kotlin("serialization", version = kotlinVersion))
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0-RC")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
  jvmTarget = "11"
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["java"])
    }
  }
}