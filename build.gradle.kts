plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.ksp) apply false
    // Tambahkan baris ini di level project:
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21" apply false
}