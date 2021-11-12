package com.example.recruitment_examination.di.builder

import com.example.recruitment_examination.view.CalcFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CalcBuilder {

    @ContributesAndroidInjector
    abstract fun contributeCalcFragment(): CalcFragment

//    @Binds
//    @IntoMap
//    @ViewModelKey(CalcViewModel::class)
//    abstract fun bindCalcViewModel(
//        calcViewModel: CalcViewModel
//    ): ViewModel
}
