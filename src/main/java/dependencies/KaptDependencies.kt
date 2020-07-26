package dependencies

/**
 * Project annotation processor dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object KaptDependencies {
    const val DAGGER = "com.google.dagger:dagger-compiler:${BuildDependenciesVersions.KOIN}"
    const val ROOM = "androidx.room:room-compiler:${BuildDependenciesVersions.ROOM}"
    const val AUTO_SERVICE = "com.google.auto.service:auto-service:${BuildDependenciesVersions.AUTO_SERVICE}"
    const val GLIDE = "com.github.bumptech.glide:compiler:${BuildDependenciesVersions.GLIDE}"
}
