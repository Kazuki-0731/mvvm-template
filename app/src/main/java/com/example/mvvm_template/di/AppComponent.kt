package com.example.mvvm_template.di

import android.app.Application
import com.example.mvvm_template.MainApplication
import com.example.mvvm_template.di.module.MVVMTemplateActivityModule
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
    MVVMTemplateActivityModule::class
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