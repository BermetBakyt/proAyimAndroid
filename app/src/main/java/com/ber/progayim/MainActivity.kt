package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private lateinit var txtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("tag", "Berg: onCreate")

        txtView = findViewById(R.id.txtView)

        button1.setOnClickListener {
            txtView.text = "Red"
            constraintLayout.setBackgroundColor("#f54248")
            Toast.makeText(this, "Click 1", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            txtView.text = "Yellow"
            Toast.makeText(this, "Click 2", Toast.LENGTH_LONG).show()
        }

        button3.setOnClickListener {
            txtView.text = "Green"
            Toast.makeText(this, "Click 3", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("tag", "Berg: onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.e("tag", "Berg: onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.e("tag", "Berg: onCreate")
    }

    override fun onStop() {
        super.onStop()
        Log.e("tag", "Berg: onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("tag", "Berg: onCreate")
    }
}