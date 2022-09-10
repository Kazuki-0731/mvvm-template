package com.example.mvvm_template.di

import dagger.Module

@Module(includes = [ViewModelModule::class])
class AppModule {
    //　今後APIを追加する場合
//    @Singleton
//    @Provides
//    fun provideTestService(): TestService {
//        return Retrofit.Builder()
//            .baseUrl("https://")
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(LiveDataCallAdapterFactory())
//            .build()
//            .create(TestService::class.java)
//    }
}
