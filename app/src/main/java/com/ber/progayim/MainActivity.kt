package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.txt)
        val btn = findViewById<Button>(R.id.btn)
        val btn2 = findViewById<Button>(R.id.btn2)

        var count = 0
        btn.setOnClickListener {
            ++count
            txt.text = count.toString()
        }

        btn2.setOnClickListener{
            when(!txt.equals(0)) {

            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("key", "value")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val value = savedInstanceState.getString("key")
    }

}
