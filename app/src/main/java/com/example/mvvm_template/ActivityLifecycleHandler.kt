package com.example.mvvm_template

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import dagger.android.AndroidInjection
import dagger.android.HasAndroidInjector
import java.lang.ref.WeakReference


class ActivityLifecycleHandler : Application.ActivityLifecycleCallbacks {
    private enum class AppStatus {
        NONE, BACKGROUND, RETURNED_TO_FOREGROUND, FOREGROUND
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        handleActivity(activity)
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
        currentActivityReference = WeakReference(activity)
    }

    override fun onActivityPaused(activity: Activity) {
        if (activity === currentActivityReference.get()) {
            currentActivityReference = WeakReference(null)
        }
    }

    override fun onActivityStopped(activity: Activity) {
        if (activity === currentActivityReference.get()) {
            currentActivityReference = WeakReference(null)
        }
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}

    override fun onActivityDestroyed(activity: Activity) {
        if (activity === currentActivityReference.get()) {
            currentActivityReference = WeakReference(null)
        }
    }

    companion object {
        private var currentActivityReference: WeakReference<Activity> = WeakReference(null)

        private fun handleActivity(activity: Activity?) {
            if (activity is HasAndroidInjector) {
                AndroidInjection.inject(activity)
            }
            if (activity is FragmentActivity) {
                (activity as FragmentActivity?)!!.supportFragmentManager
                    .registerFragmentLifecycleCallbacks(
                        object : FragmentManager.FragmentLifecycleCallbacks() {}, true
                    )
            }
        }
    }
}