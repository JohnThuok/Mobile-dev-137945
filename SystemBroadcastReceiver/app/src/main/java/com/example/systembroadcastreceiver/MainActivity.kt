package com.example.systembroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity: AppCompatActivity() {
    val receiver = AirplaneModeChangedReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//We need to register the receiver so that the system knows
//we need to be notified in the case airplane mode changes
//Intentfilter used by the system to determine which apps want to receive which intents
//in our case respond to airplane mode changes
        var receiverIntent = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(receiver, receiverIntent)
    }

    //Unregister receiver to prevent memory leaks
    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}