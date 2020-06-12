package com.example.hilt_dfm

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt_dfm.base.SampleRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.launch_regular_feature_button).setLaunchActivityClickListener(
            "com.example.hilt_dfm.regular_feature.RegularFeatureActivity"
        )
        findViewById<Button>(R.id.launch_dfm_hilt_button).setLaunchActivityClickListener(
            "com.example.hilt_dfm.dynamic_feature.DfmHiltActivity"
        )
        findViewById<Button>(R.id.launch_dfm_dagger_button).setLaunchActivityClickListener(
            "com.example.hilt_dfm.dynamic_feature.DfmDaggerActivity"
        )

        val messageText: TextView = findViewById(R.id.message_text)
        messageText.text = sampleRepository.getMessage()
    }

    private fun Button.setLaunchActivityClickListener(className: String) {
        setOnClickListener {
            val intent = Intent().also {
                it.component = ComponentName(packageName, className)
            }
            startActivity(intent)
        }
    }
}
