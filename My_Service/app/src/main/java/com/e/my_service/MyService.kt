package com.e.my_service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class MyService : Service() {
    inner class assBinder: Binder(){
        fun getMyServiceObject(): MyService{
            return this@MyService
        }
    }
    var assistant:Binder = assBinder()
    override fun onBind(intent: Intent): IBinder {
        return assistant
    }
    fun getNude():String{
        return "Send nude"
    }
}
