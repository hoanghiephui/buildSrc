plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://jcenter.bintray.com/")
    maven("https://maven.google.com")
}

object AppVersion {
    const val GRADLE_ANDROID = "4.0.1"
    const val KOTLIN = "1.3.72"
    const val NAVIGATION = "2.1.0"
    const val GOOGLE_SERVICES = "4.3.3"
}

dependencies {
    implementation("com.android.tools.build:gradle:${AppVersion.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${AppVersion.KOTLIN}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${AppVersion.NAVIGATION}")
}