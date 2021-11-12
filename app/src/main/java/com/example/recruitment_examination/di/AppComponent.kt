package com.example.recruitment_examination.di

import android.app.Application
import com.example.recruitment_examination.MainApplication
import com.example.recruitment_examination.di.module.CalcActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Injectする対象とInterface
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    CalcActivityModule::class
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