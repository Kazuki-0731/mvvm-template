package com.example.recruitment_examination.di

import android.app.Application
import com.example.recruitment_examination.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityModule::class,
    ViewModelModule::class
])
interface AppComponent : AndroidInjector<MainApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    override fun inject(application: MainApplication?)
}