package com.e.switchtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener{_, isChecked ->
            if(isChecked){
                img1.visibility = View.INVISIBLE
            }
            else{
              img2.visibility = View.VISIBLE
            }

        }

    }
}
