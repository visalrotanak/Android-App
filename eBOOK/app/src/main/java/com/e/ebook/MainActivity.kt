package com.e.ebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var index = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next.setOnClickListener() {
            when (index) {
                1 -> {
                    page_1.visibility = View.GONE
                    page_2.visibility = View.VISIBLE
                    index = 2
                }
                2 -> {
                    page_2.visibility = View.GONE
                    page_3.visibility = View.VISIBLE
                    index = 3
                }
                3 -> {
                    page_3.visibility = View.GONE
                    page_4.visibility = View.VISIBLE
                    index = 4
                }
                4->{
                    page_4.visibility = View.GONE
                    page_1.visibility = View.VISIBLE
                    index = 1
                }

            }

            back.setOnClickListener() {
                when(index){
                    4 ->{
                     page_4.visibility = View.GONE
                        page_1.visibility = View.VISIBLE
                        index = 3
                    }
                    3 ->{
                        page_3.visibility = View.GONE
                        page_2.visibility = View.VISIBLE
                        index = 2
                    }
                    2 -> {
                        page_2.visibility = View.GONE
                        page_1.visibility = View.VISIBLE
                        index = 1
                    }
                    1 -> {
                        page_1.visibility = View.GONE
                        page_4.visibility = View.VISIBLE
                    }
                }
            }
        }
    }
}


