package com.example.hilt_dfm

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.launch_dfm_button)
        button.setOnClickListener {
            val intent = Intent().also {
                it.component = ComponentName(
                    packageName,
                    "com.example.hilt_dfm.feature.DfmActivity"
                )
            }
            startActivity(intent)
        }

        val messageText: TextView = findViewById(R.id.message_text)
        messageText.text = sampleRepository.getMessage()
    }
}
