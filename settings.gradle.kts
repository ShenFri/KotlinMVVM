pluginManagement {
    repositories {
        maven ( "https://mirrors.tencent.com/nexus/repository/maven-public/" )

        includeBuild("compositebuild")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven ( "https://mirrors.tencent.com/nexus/repository/maven-public/" )
        
        google()
        mavenCentral()
    }
}

rootProject.name = "KotlinMVVM"
include(":app")
include(":baselib")
