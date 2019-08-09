package com.e.new_service

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sreySaObject:Sreysa? = null
    var sc: ServiceConnection = object : ServiceConnection{
        override fun onServiceDisconnected(p0: ComponentName?) { }
        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            var tevyBinder = p1 as Sreysa.TevyBinder
            sreySaObject = tevyBinder.getSreysaObject()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = Intent(this,Sreysa::class.java)
        bindService(i,sc, Context.BIND_AUTO_CREATE)
    }
    fun getBread(v: View) {
        textView.text = "Love you"
    }

}
