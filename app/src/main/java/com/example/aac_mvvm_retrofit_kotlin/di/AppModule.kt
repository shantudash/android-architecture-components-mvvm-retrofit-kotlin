package com.example.aac_mvvm_retrofit_kotlin.di

import android.content.Context
import com.example.aac_mvvm_retrofit_kotlin.ui.MyApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): MyApplication {
        return app as MyApplication
    }
}