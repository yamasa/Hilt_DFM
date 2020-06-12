package com.example.hilt_dfm

import com.example.hilt_dfm.base.SampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSampleRepository(): SampleRepository {
        return SampleRepositoryImpl()
    }
}
