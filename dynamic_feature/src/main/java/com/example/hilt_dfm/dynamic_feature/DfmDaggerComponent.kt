package com.example.hilt_dfm.dynamic_feature

import com.example.hilt_dfm.DynamicFeatureDependencies
import dagger.Component

@Component(dependencies = [DynamicFeatureDependencies::class])
interface DfmDaggerComponent {

    fun inject(activity: DfmDaggerActivity)

    @Component.Factory
    interface Factory {
        fun create(dependencies: DynamicFeatureDependencies): DfmDaggerComponent
    }
}
