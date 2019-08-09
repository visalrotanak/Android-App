package com.e.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Resumed", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Paused", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Stopped", Toast.LENGTH_SHORT).show()
    }
    fun startNewActivity(v: View){
        var intent = Intent(this, Main2Activity::class.java)

//        intent.putExtra("username","Rotanek")
//        intent.putExtra("school","TIK")
        var bundle = Bundle()
        bundle.putString("name","Makara")
        bundle.putString("school","TIK")

        intent.putExtras(bundle)
        startActivity(intent)
    }

}
