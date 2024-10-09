pluginManagement {
    repositories {
        includeBuild("compositebuild")
        maven ( "https://maven.aliyun.com/repository/public/" )
        maven ( "https://jitpack.io" )
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven ( "https://maven.aliyun.com/repository/public/" )
        maven ( "https://jitpack.io" )
        google()
        mavenCentral()
    }
}

rootProject.name = "KotlinMVVM"
include(":app")
include(":baselib")
