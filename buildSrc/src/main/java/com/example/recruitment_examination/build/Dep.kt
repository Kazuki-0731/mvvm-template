package com.example.recruitment_examination.build

object Dep {
    object Androidx {
        const val core = "androidx.core:core-ktx:1.7.0"
        const val appcompat = "androidx.appcompat:appcompat:1.3.1"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.1"
        const val fragment = "androidx.fragment:fragment-ktx:1.3.6"

        object Test {
            const val core = "androidx.test:core:1.4.0"
            const val extJunit = "androidx.test.ext:junit:1.1.3"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
            const val runner = "androidx.test:runner:1.4.0"
            const val rules = "androidx.test:rules:1.4.0"
            const val espressoIntents = "androidx.test.espresso:espresso-intents:3.4.0"
        }
    }

    object Junit {
        const val junit = "junit:junit:4.13.2"
    }

    object Mockito {
        const val core = "org.mockito:mockito-core:2.25.0"
    }

    object Google {
        const val material = "com.google.android.material:material:1.4.0"
    }

    object Log {
        const val timber = "com.jakewharton.timber:timber:5.0.1"
    }

    object Dagger {
        const val core = "com.google.dagger:dagger:2.40"
        const val android = "com.google.dagger:dagger-android:2.40"
        const val androidSupport = "com.google.dagger:dagger-android-support:2.40"
        const val compiler = "com.google.dagger:dagger-compiler:2.40"
        const val androidProcessor = "com.google.dagger:dagger-android-processor:2.40"
    }

    object Lifecycle {
        const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0"
        const val runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
        const val common_java8 = "androidx.lifecycle:lifecycle-common-java8:2.4.0"
        const val compiler = "androidx.lifecycle:lifecycle-compiler:2.4.0"
    }
}