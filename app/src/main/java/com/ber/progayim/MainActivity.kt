package com.ber.progayim


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var txtView: TextView
    private lateinit var layout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      txtView = findViewById(R.id.txt_1)
      layout = findViewById(R.id.layout)
      val btn1 = findViewById<AppCompatButton>(R.id.btn1)
      val btn2 = findViewById<AppCompatButton>(R.id.btn2)
      val btn3 = findViewById<AppCompatButton>(R.id.btn3)

      btn1.setOnClickListener(this)
      btn2.setOnClickListener(this)
      btn3.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
    val msg = when (view?.id) {
        R.id.btn1 -> {
            txtView.text = "RED"
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.customRed))
        }
        R.id.btn2 -> {
            txtView.text = "GREEN"
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.customGreen))
        }
        R.id.btn3 -> {
            txtView.text = "YELLOW"
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.customYellow))
        }
        else -> "Unknown"
    }
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