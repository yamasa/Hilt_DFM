package com.example.hilt_dfm.feature

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DfmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dfm)

        val messageText: TextView = findViewById(R.id.message_text)
        messageText.text = "TODO"
    }
}
