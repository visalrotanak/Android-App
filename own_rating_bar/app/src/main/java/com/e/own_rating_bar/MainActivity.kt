package com.e.own_rating_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RatingBar.OnRatingBarChangeListener{
    override fun onRatingChanged(p0: RatingBar?, p1:Float, p2:Boolean){
        textView.text = "$p1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ratingBar.onRatingBarChangeListener = this
//        ratingBar.setOnRatingBarChangeListener(RatingBar.OnRatingBarChangeListener{
//
//        })
//        class RatingListener: RatingBar.OnRatingBarChangeListener{
//           override fun onRat
//        }
//
//        var rl = RatingListener()
//
//        ratingBar.setOnRatingBarChangeListener(rl)
    }
}
