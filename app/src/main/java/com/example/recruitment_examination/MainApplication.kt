package com.example.recruitment_examination

import android.app.Activity
import android.app.Application
import com.example.recruitment_examination.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

//Application(), HasActivityInjector
class MainApplication : Application(), HasAndroidInjector {
//    @RequiresApi(Build.VERSION_CODES.Q)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        AppInjector.init(this)
//    }

    @Inject
    var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>? = null
//    fun activityInjector() = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            ?.build()
            ?.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any?>? {
        return dispatchingAndroidInjector
    }
}