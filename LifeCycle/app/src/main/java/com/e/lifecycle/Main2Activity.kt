package com.e.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var user = intent.getStringExtra("username")
        var sch = intent.getStringExtra("Kirirom School")
        detail.text = "User =$user and school is $sch"

//        var bundle = intent.extras
//        detail.text = "user = ${bundle?.get("name")} and School = ${bundle?.get("school")}"
//

    }
}
