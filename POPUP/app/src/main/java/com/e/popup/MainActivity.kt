package com.e.popup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    action.setOnClickListener{
        var popup = PopupMenu(this,it)
        popup.inflate(R.menu.my_menu)
        popup.show()
        popup.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId){
                R.id.item1 -> {
                    Toast.makeText(this,"Java", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.item2 -> {
                    Toast.makeText(this,"Java", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.item3 -> {
                    Toast.makeText(this,"Java", Toast.LENGTH_LONG).show()
                    true
                }

                else -> {
                    false
                }
            }
        }
    }
    }
}
