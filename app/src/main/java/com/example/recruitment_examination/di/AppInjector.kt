package com.example.recruitment_examination.di

import android.app.Activity
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.example.recruitment_examination.ActivityLifecycleHandler
import com.example.recruitment_examination.MainApplication
import dagger.android.AndroidInjection
import dagger.android.HasAndroidInjector


class AppInjector {
//    private var component: AppComponent? = null
//    private fun AppInjector() {}
//    fun getAppComponent(): AppComponent? {
//        return component
//    }

    private fun handleActivity(activity: Activity) {
        if (activity is HasAndroidInjector) {
            AndroidInjection.inject(activity)
        }
        if (activity is FragmentActivity) {
            (activity as FragmentActivity).supportFragmentManager
                .registerFragmentLifecycleCallbacks(
                    object : FragmentManager.FragmentLifecycleCallbacks() {
                    }, true)
        }
    }

    companion object {
//        var component: AppInjector? = null
//        fun createInstance() = if(component != null) AppInjector() else { component }
        @RequiresApi(Build.VERSION_CODES.Q)
        fun init(application: MainApplication) {
//            component = DaggerAppComponent.builder()
//                .application(application)
//                .build()
//            component!!.inject(application)
            application.registerActivityLifecycleCallbacks(ActivityLifecycleHandler())
        }
    }
}