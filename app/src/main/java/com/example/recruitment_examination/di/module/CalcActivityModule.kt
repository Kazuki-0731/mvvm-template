package com.example.recruitment_examination.di.module

import com.example.recruitment_examination.di.builder.FragmentBuildersModule
import com.example.recruitment_examination.view.CalcActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class CalcActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): CalcActivity

    // etc...
}
