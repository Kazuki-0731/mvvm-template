package com.example.recruitment_examination.di

import androidx.lifecycle.ViewModelProvider
import com.example.recruitment_examination.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

/**
 * 共通Module
 */
@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}