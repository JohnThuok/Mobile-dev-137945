package com.example.systembroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state",  false) ?: return
//Notify any app that is subscribed to this event..ie is actively listening for airplane mode deactivation/activation
if(isAirPlaneModeEnabled) {
        Toast.makeText(context,"Airplane Mode enabled", Toast.LENGTH_LONG).show()
    } else
    {
        Toast.makeText(context, "Airplane Mode is disabled", Toast.LENGTH_LONG).show()
    }
}
}