package com.example.mvvm_template.di.builder

import com.example.mvvm_template.view.MVVMTemplateFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeMVVMTemplateFragment(): MVVMTemplateFragment
}
