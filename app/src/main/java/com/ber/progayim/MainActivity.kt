package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

// так не работает же сохранение значения при перевороте экрана

class MainActivity : AppCompatActivity() {
    private lateinit var txt: TextView
    private lateinit var btn: Button
    private var count: Int = 0

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
            if(!txt.equals(0)) {
                txt.text = 0.toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("count", count.toString())

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val count = savedInstanceState.getString("count")
    }

}
