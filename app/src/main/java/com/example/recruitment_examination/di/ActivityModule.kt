package com.example.recruitment_examination.di

import com.example.recruitment_examination.di.builder.CalcBuilder
import com.example.recruitment_examination.view.CalcActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [CalcBuilder::class])
    abstract fun contributeCalcActivity(): CalcActivity?
}