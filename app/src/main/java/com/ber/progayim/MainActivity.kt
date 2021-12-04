package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.txt)
        val btnIncrement = findViewById<Button>(R.id.btn)
        val resetBtn = findViewById<Button>(R.id.btn2)

        var count = 0
        btnIncrement.setOnClickListener {
            count++
            txt.text = "$count"
        }

        resetBtn.setOnClickListener{
            count = 0
            txt.text = "$count"
        }
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("key")
            txt.text = "$count"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("key", count)

    }
}
