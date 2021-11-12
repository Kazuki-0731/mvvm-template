package com.example.recruitment_examination.di.module

import androidx.lifecycle.ViewModel
import com.example.recruitment_examination.di.ViewModelKey
import com.example.recruitment_examination.di.builder.CalcBuilder
import com.example.recruitment_examination.view.CalcActivity
import com.example.recruitment_examination.viewmodel.CalcViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * ActivityごとのModule
 */
@Module
abstract class CalcModule {
    // Calc Activity
    @ContributesAndroidInjector(
        modules = [
            CalcBuilder::class
        ]
    )
    abstract fun contributeCalcActivity(): CalcActivity

    @Binds
    @IntoMap
    @ViewModelKey(CalcViewModel::class)
    abstract fun bindCalcViewModel(
        calcViewModel: CalcViewModel
    ): ViewModel

    // etc...
}