package com.example.mvvm_template.di.module

import com.example.mvvm_template.di.builder.FragmentBuildersModule
import com.example.mvvm_template.view.MVVMTemplateActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MVVMTemplateActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MVVMTemplateActivity

    // etc...
}
