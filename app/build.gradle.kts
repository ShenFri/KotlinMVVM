plugins {
    id("app.gradle.plugin")
    id("kotlin-kapt")
}

android {
    kapt{
        generateStubs = true
    }
}

dependencies {
    implementation(project(":baselib"))
}