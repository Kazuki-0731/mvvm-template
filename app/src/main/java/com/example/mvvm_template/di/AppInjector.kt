package com.example.mvvm_template.di

import com.example.mvvm_template.ActivityLifecycleHandler
import com.example.mvvm_template.MainApplication
import com.example.mvvm_template.di.DaggerAppComponent

/**
 * Dagger保持
 */
class AppInjector {
    companion object {
        var component: AppComponent? = null
        fun init(application: MainApplication) {
            component = DaggerAppComponent.builder()
                .application(application)
                .build()
            component!!.inject(application)
            application.registerActivityLifecycleCallbacks(ActivityLifecycleHandler())
        }
    }
}