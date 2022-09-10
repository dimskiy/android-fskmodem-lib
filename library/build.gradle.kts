plugins {
    id("com.android.library")
    id("maven-publish")
}

android {
    namespace = "cytec.android.fskmodem"

    defaultConfig {
        minSdk = 19
        targetSdk = 32
        compileSdk = 32
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildOutputs.all {
        val variantOutputImpl = this as com.android.build.gradle.internal.api.BaseVariantOutputImpl
        variantOutputImpl.outputFileName = "android-fskmodem-${variantOutputImpl.name}.aar"
    }

    afterEvaluate {
        publishing {
            publications {
                create<MavenPublication>("release") {
                    from(components.getByName("release"))

                    groupId = "com.github.dimskiy"
                    artifactId = "android-fskmodem"
                    version = "1.0"
                }
            }
        }
    }
}