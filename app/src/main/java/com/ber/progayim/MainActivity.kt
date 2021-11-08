package com.ber.progayim

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var txtView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      txtView = findViewById(R.id.txt_1)
      val btn1 = findViewById<AppCompatButton>(R.id.btn1)
      val btn2 = findViewById<AppCompatButton>(R.id.btn2)
      val btn3 = findViewById<AppCompatButton>(R.id.btn3)

      btn1.setOnClickListener(this)
      btn2.setOnClickListener(this)
      btn3.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
    val msg = when (view?.id) {
        R.id.btn1 -> "RED"
        R.id.btn2 -> "GREEN"
        R.id.btn3 -> "YELLOW"
        else -> "Unknown"
    }
    txtView.text = msg
    }


}


// Deprecated version of changing text by clicking button
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//}
//fun onClickEvent(view: View) {
//    val msg = when (view.id) {
//        R.id.btn1 -> "Click 1"
//        R.id.btn2 -> "Click 2"
//        R.id.btn3 -> "Click 3"
//        else -> "Unknown"
//    }
//    val txtView = findViewById<AppCompatTextView>(R.id.txt_1)
//    txtView.text = msg
//}