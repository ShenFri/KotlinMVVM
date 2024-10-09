plugins {
    id("app.gradle.plugin")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    kapt{
        generateStubs = true
    }
}

dependencies {
    implementation(project(":baselib"))
}