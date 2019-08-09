package com.e.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyMusicService: Service() {
    var player: MediaPlayer? = null

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
    override fun onCreate(){
        super.onCreate()
        player = MediaPlayer.create(this,R.raw.home_song)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player?.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        player?.stop()
        super.onDestroy()
    }


}