package com.example.recruitment_examination.di

import com.example.recruitment_examination.ActivityLifecycleHandler
import com.example.recruitment_examination.MainApplication


class AppInjector {
//    private var component: AppComponent? = null
//    private fun AppInjector() {}
//    fun getAppComponent(): AppComponent? {
//        return component
//    }

//    private fun handleActivity(activity: Activity) {
//        if (activity is HasAndroidInjector) {
//            AndroidInjection.inject(activity)
//        }
//        if (activity is FragmentActivity) {
//            (activity as FragmentActivity).supportFragmentManager
//                .registerFragmentLifecycleCallbacks(
//                    object : FragmentManager.FragmentLifecycleCallbacks() {
//                    }, true)
//        }
//    }

    companion object {
        var component: AppComponent? = null
//        fun createInstance() = if(component != null) AppInjector() else { component }
        fun init(application: MainApplication) {
            component = DaggerAppComponent.builder()
                .application(application)
                .build()
            component!!.inject(application)
            application.registerActivityLifecycleCallbacks(ActivityLifecycleHandler())
        }
    }
}