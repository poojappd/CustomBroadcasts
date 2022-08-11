package com.example.custombroadcasts

import android.content.BroadcastReceiver
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
       Toast.makeText(context, "${context} receiver\n UID - ${android.os.Process.myUid()}", Toast.LENGTH_SHORT).show()
        Log.e(TAG,"Receivedf")
        val intent = Intent("android.intent.action.MAIN")
        context.startActivity(intent)
    }


}