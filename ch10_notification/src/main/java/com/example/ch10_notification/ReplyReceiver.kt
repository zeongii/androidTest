package com.example.ch10_notification

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.RemoteInput

class ReplyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val replyTxt = RemoteInput.getResultsFromIntent(intent)
            ?.getCharSequence("key_text_Reply")
        Log.d("kkang", "replyTxt : $replyTxt")

        val manager = context.getSystemService(
            AppCompatActivity.NOTIFICATION_SERVICE) as NotificationManager
        manager.cancel(11)



        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("ReplyReceiver.onReceive() is not implemented")
    }
}