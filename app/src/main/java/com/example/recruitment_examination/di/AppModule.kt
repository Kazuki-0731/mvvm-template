package com.example.recruitment_examination.di

import dagger.Module

@Module(includes = [ViewModelModule::class])
class AppModule {
    //　今後保守する時用
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
