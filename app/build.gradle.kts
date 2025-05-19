plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.prot.lakbayapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.prot.lakbayapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }

        kotlinOptions {
            jvmTarget = "17"
        }

        buildFeatures {
            viewBinding = true
        }
    }

    dependencies {
        // Use the version catalog alias for core-ktx and remove the older direct dependency
        implementation(libs.androidx.core.ktx) // This uses coreKtx = "1.16.0"

        implementation("androidx.appcompat:appcompat:1.6.1") // Keep this if you use AppCompat components

        // This is for View-based Material Components.
        implementation("com.google.android.material:material:1.12.0")

        // Use the version catalog alias for ConstraintLayout and remove direct/duplicate declarations
        implementation(libs.androidx.constraintlayout) // This should fix the unresolved reference

        implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
        implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

        testImplementation(libs.junit) // Use alias
        androidTestImplementation(libs.androidx.junit) // Corrected alias (assuming you meant androidx-junit from your toml)
        androidTestImplementation(libs.androidx.espresso.core) // Use alias

        // This is for Jetpack Compose Material 3.
        // If your project primarily uses XML layouts and ViewBinding, you might not need this.
        // If you are using Compose, ensure your setup is correct for it.
        implementation(libs.androidx.material3)
    }