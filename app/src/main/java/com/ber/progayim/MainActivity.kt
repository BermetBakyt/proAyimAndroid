package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
//        menu?.add("menu 10")
//        menu?.add("menu 20")
//        menu?.add("menu 30")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.menu_1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment1())
                    .commit()
            }
            R.id.menu_2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment2())
                    .commit()
            }
            R.id.menu_3 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment3())
                    .commit()
            }
            else -> {}
        }
        Toast.makeText(this, item.title, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}

