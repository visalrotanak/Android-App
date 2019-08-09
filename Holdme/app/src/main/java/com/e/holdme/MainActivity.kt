package com.e.holdme

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    var gdc:GestureDetectorCompat? = null
    override fun onShowPress(p0: MotionEvent?) {
        text.text = "OnShowPress"
        page.setBackgroundColor(Color.RED)

            }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
    text.text = "OnSingleTapUp"
        page.setBackgroundColor(Color.BLUE)
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
    text.text = "OnDown"
        page.setBackgroundColor(Color.GREEN)
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
    text.text = "OnFling"
        page.setBackgroundColor(Color.GRAY)
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
    text.text = "OnScroll"
        page.setBackgroundColor(Color.RED)
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
    text.text = "OnLongPress"
        page.setBackgroundColor(Color.MAGENTA)
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
    text.text = "OnDoubleTap"
        page.setBackgroundColor(Color.LTGRAY)
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
    text.text = "OnDoubleTapEvent"
        page.setBackgroundColor(Color.CYAN)
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        text.text = "OnSingleTapConfirmed"
        page.setBackgroundColor(Color.RED)
        return true
    }
    override fun onTouchEvent(event:MotionEvent?):Boolean{
    gdc?.onTouchEvent(event)
    return super.onTouchEvent(event)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gdc = GestureDetectorCompat(this,this)
        gdc?.setOnDoubleTapListener(this)
    }


}
