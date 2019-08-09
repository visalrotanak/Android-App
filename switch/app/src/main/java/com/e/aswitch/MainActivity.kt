package com.e.aswitch

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        page.setBackgroundColor(Color.RED)
        switcher.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked){
                page.setBackgroundColor(Color.GREEN)
                switcher.setBackgroundColor(Color.GREEN)
            }
            else{
                page.setBackgroundColor(Color.      YELLOW)
                switcher.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}
