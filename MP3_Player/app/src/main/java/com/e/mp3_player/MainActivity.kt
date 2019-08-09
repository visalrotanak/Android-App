package com.e.mp3_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showToast(view: View){
        var view = layoutInflater.inflate(R.layout.custom_toast, null)

        var myToast = Toast(this)
        myToast.duration = Toast.LENGTH_LONG
        myToast.setGravity(Gravity.BOTTOM,0,50)
        myToast.view = view
        myToast.show()

    }
}
 