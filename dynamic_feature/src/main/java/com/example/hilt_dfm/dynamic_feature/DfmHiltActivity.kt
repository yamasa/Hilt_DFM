package com.example.hilt_dfm.dynamic_feature

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt_dfm.base.SampleRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// NOTE: Since Hilt doesn't work with dynamic feature modules, this activity will crash!
@AndroidEntryPoint
class DfmHiltActivity : AppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dfm_hilt)

        val messageText: TextView = findViewById(R.id.message_text)
        messageText.text = sampleRepository.getMessage()
    }
}
