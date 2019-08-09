package com.e.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var order:String = ""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getSelected.setOnClickListener{
//            if(java.isChecked){
//                Toast.makeText(this, "Java is Selected", Toast.LENGTH_LONG).show()
//            }
//            if(python.isChecked){
//                Toast.makeText(this, "Python is selected", Toast.LENGTH_LONG).show()
//            }
//            if(Ja.isChecked){
//                Toast.makeText(this, "Java Script is selected", Toast.LENGTH_LONG).show()
//            }
//        }

        getSelected.setOnClickListener{
            order = ""
            if(java.isChecked){
                order+="Java"
            }
            if(python.isChecked){
                order+="Python"
            }
            if(js.isChecked){
                order+="Java Script"
            }
            Toast.makeText(this,order, Toast.LENGTH_LONG).show()
        }

    }
}
