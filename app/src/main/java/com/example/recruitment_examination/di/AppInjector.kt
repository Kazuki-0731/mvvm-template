package com.example.recruitment_examination.di

import com.example.recruitment_examination.ActivityLifecycleHandler
import com.example.recruitment_examination.MainApplication

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