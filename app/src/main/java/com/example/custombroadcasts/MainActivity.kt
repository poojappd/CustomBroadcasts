package com.example.custombroadcasts

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        IntentFilter("com.example.broadcast.MY_NOTIFICATION").apply {
            registerReceiver(MyReceiver(), this)
        }
    }

    fun buttonOnclick(view: View){
        Intent().also { intent ->
            intent.action = "com.example.broadcast.MY_NOTIFICATION"
            intent.putExtra("data", "Nothing to see here, move along.")
            sendBroadcast(intent)
        }
    }


}