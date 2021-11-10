package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)

        btn1.setOnClickListener()
    }
    private fun onClick(v: View) {
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = when(v.id) {
            R.id.frg1_btn -> Fragment1()

            R.id.frg1_btn2 -> Fragment2()
            R.id.frg1_btn3 -> Fragment3()
            else -> {}
        }
        // -------код делает то же самое что и replace
//        val fragmentFind = supportFragmentManager.findFragmentById(R.id.fragment_container)
//        if (fragmentFind != null) {
//            trancsaction.remove(fragmentFind)
//        }
//        transaction.add(R.id.fragment_container, fragment)
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}

