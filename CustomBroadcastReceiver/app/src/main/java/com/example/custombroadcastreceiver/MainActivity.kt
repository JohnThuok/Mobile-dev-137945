package com.example.custombroadcastreceiver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Move the intent creation and broadcast sending inside the onCreate method
        val intent = Intent(this, CustomReceiver::class.java)
        intent.action = "com.example.CUSTOM_INTENT" // indicate which type of intent to respond to..this is a custom intent
        sendBroadcast(intent)
    }
}