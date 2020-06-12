package com.example.hilt_dfm

import com.example.hilt_dfm.base.SampleRepository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@EntryPoint
@InstallIn(ApplicationComponent::class)
interface DynamicFeatureDependencies {

    fun sampleRepository(): SampleRepository
}
