package com.e.colortask

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var red = 0
    var green = 0
    var blue = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar1.max = 255
        seekBar2.max = 255
        seekBar3.max = 255
        class CommonListener:SeekBar.OnSeekBarChangeListener{

            var btn = 0
            constructor(btn:Int){
                this.btn = btn
            }
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id){
                    R.id.seekBar1 ->{
                        red = p1
                    }
                    R.id.seekBar2 ->{
                        green = p1
                    }
                    R.id.seekBar3 ->{
                        blue = p1
                    }
                }

                var color = Color.rgb(red,green,blue)
                if (btn == 1){
                    button.setBackgroundColor(color)
                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }



        button.setOnClickListener{
            button.setBackgroundColor(Color.rgb(red, green, blue))
            var commonListener = CommonListener(1)
            seekBar1.setOnSeekBarChangeListener(commonListener)
            seekBar2.setOnSeekBarChangeListener(commonListener)
            seekBar3.setOnSeekBarChangeListener(commonListener)
        }


    }

}
