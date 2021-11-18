package com.example.mvvm_template.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_template.viewmodel.MVVMTemplateViewModel
import com.example.mvvm_template.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    // ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(MVVMTemplateViewModel::class)
    abstract fun bindMVVMTemplateViewModel(MVVMTemplateViewModel: MVVMTemplateViewModel): ViewModel

    // etc...

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
