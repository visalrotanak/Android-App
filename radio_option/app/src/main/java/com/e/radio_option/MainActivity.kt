package com.e.radio_option

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            var selRadio = group.checkedRadioButtonId
            when (selRadio) {
                R.id.radioButton1 -> {
                    Toast.makeText(this, "Option1", Toast.LENGTH_LONG).show()
                }
                R.id.radioButton2 -> {
                    Toast.makeText(this, "Option1", Toast.LENGTH_LONG).show()
                }
                R.id.radioButton3 -> {
                    Toast.makeText(this, "Option1", Toast.LENGTH_LONG).show()
                }

            }

        }
    }
}

