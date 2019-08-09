package com.e.contexmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(tv)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.item1 -> {
                Toast.makeText(this,"Java",Toast.LENGTH_LONG).show()
            }
            R.id.item2 -> {
                Toast.makeText(this,"Python",Toast.LENGTH_LONG).show()
            }
            R.id.item3 -> {
                Toast.makeText(this,"Java Script",Toast.LENGTH_LONG).show()
            }
        }

        return super.onContextItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu,menu)
    }


 
    }

