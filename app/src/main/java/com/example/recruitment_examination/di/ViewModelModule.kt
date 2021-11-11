package com.example.recruitment_examination.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recruitment_examination.viewmodel.CalcViewModel
import com.example.recruitment_examination.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CalcViewModel::class)
    abstract fun bindCalcViewModel(
        calcViewModel: CalcViewModel
    ): ViewModel
}