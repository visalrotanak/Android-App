package com.e.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun goHome(v: View){
        var i = Intent()
        var username = editText.text.toString()

        i.putExtra("Data",username)
        setResult(RESULT_OK,i)
        finish()
    }



}
