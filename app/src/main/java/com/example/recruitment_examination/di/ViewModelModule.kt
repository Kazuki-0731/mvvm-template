package com.example.recruitment_examination.di

import androidx.lifecycle.ViewModel
import com.example.recruitment_examination.viewmodel.CalcViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CalcViewModel::class)
    abstract fun bindCalcViewModel(
        calcViewModel: CalcViewModel
    ): ViewModel
}