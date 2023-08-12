import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.9.0"
}

group = "org.beckn.jvm"
version = "1.0"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.+")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.+")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
  jvmTarget = "11"
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
}
