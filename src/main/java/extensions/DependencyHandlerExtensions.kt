package extensions

import dependencies.Dependencies
import dependencies.KaptDependencies
import dependencies.TestAndroidDependencies
import dependencies.TestDependencies
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

/**
 * Adds a dependency to the `debugImplementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.debugImplementation(dependencyNotation: String): Dependency? =
        add("debugImplementation", dependencyNotation)

/**
 * Adds a dependency to the `implementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.implementation(dependencyNotation: String): Dependency? =
        add("implementation", dependencyNotation)

/**
 * Adds a dependency to the `api` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.api(dependencyNotation: String): Dependency? =
        add("api", dependencyNotation)

/**
 * Adds a dependency to the `kapt` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.kapt(dependencyNotation: String): Dependency? =
        add("kapt", dependencyNotation)

/**
 * Adds a dependency to the `testImplementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.testImplementation(dependencyNotation: String): Dependency? =
        add("testImplementation", dependencyNotation)


/**
 * Adds a dependency to the `androidTestImplementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.androidTestImplementation(dependencyNotation: String): Dependency? =
        add("androidTestImplementation", dependencyNotation)

/**
 * Adds all the tests dependencies to specific configuration.
 */
fun DependencyHandler.addTestsDependencies() {
    testImplementation(TestDependencies.JUNIT)
    testImplementation(TestDependencies.MOCKITO)
    testImplementation(TestDependencies.MOCKK)
    testImplementation(TestDependencies.ASSERTJ)
    testImplementation(TestDependencies.ROBOELECTRIC)
    testImplementation(TestDependencies.ROOM)
    testImplementation(TestDependencies.CORE)
    testImplementation(TestDependencies.ARCH_CORE)
    testImplementation(TestDependencies.RULES)
    testImplementation(TestDependencies.RUNNER)
    testImplementation(TestDependencies.COROUTINES_TEST)
    testImplementation(TestDependencies.FRAGMENT_TEST)
    testImplementation(TestDependencies.EXT)
    testImplementation(TestDependencies.MOCK_WEB_SERVER)

    androidTestImplementation(TestAndroidDependencies.PLAY_CORE)
    androidTestImplementation(TestAndroidDependencies.MOCKITO)
    androidTestImplementation(TestAndroidDependencies.ESPRESSO)
    androidTestImplementation(TestAndroidDependencies.RUNNER)
    androidTestImplementation(TestAndroidDependencies.RULES)
    androidTestImplementation(TestAndroidDependencies.JUNIT)
    androidTestImplementation(TestAndroidDependencies.FRAGMENT_TEST)
}

fun DependencyHandler.addModuleDependencies() {
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.BIOMETRIC)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.KOIN)
    implementation(Dependencies.KOIN_VIEW_MODEL)
    implementation(Dependencies.KOIN_FRAGMENT)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    implementation(Dependencies.RETROFIT_SCALARS)
    implementation(Dependencies.LOGGING_INTERCEPTOR)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.NAVIGATION_DYNAMIC_FEATURE)
    implementation(Dependencies.FLEXIBLE_ADAPTER)
    implementation(Dependencies.FLEXIBLE_ADAPTER_UI)
    implementation(Dependencies.FLEXIBLE_ADAPTER_LIVE_DATA)
    implementation(Dependencies.UTILS)
    implementation(Dependencies.INLINE_ACTIVITY_RESULT)
}

fun DependencyHandler.addDependenciesBase() {
    implementation(Dependencies.KOTLIN)
    //UI
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.BROWSER)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.FLEXBOX)
    implementation(Dependencies.SWIPE_REFRESH_LAYOUT)
    // Architecture Components
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.LIFECYCLE_LIVE_DATA)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.ROOM)
    implementation(Dependencies.ROOM_KTX)
    kapt(KaptDependencies.ROOM)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.WORK_MANAGE)
    implementation(Dependencies.WORK_MANAGE_KTX)
    api(Dependencies.WORK_MANAGE_KTX)
    api(Dependencies.COROUTINES)
    // Utils
    api(Dependencies.TIMBER)
    implementation(Dependencies.CORE_KTX)
    // Google Play Instant and Google Play core
    implementation(Dependencies.INSTANT_APPS)
    implementation(Dependencies.PLAY_CORE)
    implementation(Dependencies.GOOGLE_BILLING)
    // Dagger
    implementation(Dependencies.DAGGER_ANDROID)
    implementation(Dependencies.DAGGER_ANDROID_SUPPORT)
    kapt(Dependencies.DAGGER_ANDROID_COMPILER)
    kapt(Dependencies.DAGGER_ANDROID_PROCESSOR)
    //Network
    implementation(Dependencies.GSON)
    implementation(Dependencies.OK_HTTP)
    implementation(Dependencies.LOGGING_INTERCEPTOR)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_RXJAVA)
    implementation(Dependencies.RETROFIT_CONVERTER)
    //RxJava
    implementation(Dependencies.RX_JAVA)
    implementation(Dependencies.RX_KOTLIN)
    implementation(Dependencies.RX_ANDROID)

}
