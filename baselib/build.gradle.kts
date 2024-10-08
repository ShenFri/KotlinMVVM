plugins {
    id("baselib.gradle.plugin")
    id("kotlin-kapt")
}

android {
    kapt {
        generateStubs = true
    }
}

