plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.ilm_e_jafar" // Update with your actual package name
    compileSdk = flutter.compileSdkVersion
    ndkVersion = "27.0.12077973" // Update if needed

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.ilm_e_jafar" // Update with your actual application ID
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true // Enables code shrinking, obfuscation, and optimization
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")

            // TODO: Add your own signing config for the release build.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
dependencies {
    //noinspection PlaySdkIndexDeprecated
    //noinspection RiskyLibrary
    implementation("com.google.android.play:core:1.10.3") // Add Play Core dependency
    // Other dependencies
}
flutter {
    source = "../.." // Adjust if necessary based on your project structure
}