package com.example.recruitment_examination.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recruitment_examination.viewmodel.CalcViewModel
import com.example.recruitment_examination.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    // Calc ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(CalcViewModel::class)
    abstract fun bindCalcViewModel(calcViewModel: CalcViewModel): ViewModel

    // etc...

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
