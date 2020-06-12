package com.example.hilt_dfm.dynamic_feature

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt_dfm.DynamicFeatureDependencies
import com.example.hilt_dfm.base.SampleRepository
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

class DfmDaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        // Since Hilt doesn't work with dynamic feature modules, use plain Dagger instead.
        // cf. https://developer.android.com/training/dependency-injection/hilt-multi-module#dfm
        DaggerDfmDaggerComponent.factory().create(
            EntryPointAccessors.fromApplication(this, DynamicFeatureDependencies::class.java)
        ).inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dfm_dagger)

        val messageText: TextView = findViewById(R.id.message_text)
        messageText.text = sampleRepository.getMessage()
    }
}
