pluginManagement {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-eap")
        jcenter()
        gradlePluginPortal()
    }
}

rootProject.name = "uuid"

buildCache {
    local {
        directory = "$rootDir/build/cache/"
        removeUnusedEntriesAfterDays = 30
    }
}
