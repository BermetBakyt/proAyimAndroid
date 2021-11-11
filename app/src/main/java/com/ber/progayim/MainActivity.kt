package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), OnButtonClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.btn_register)
        btn.setOnClickListener(::onClick)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, Fragment1())
            .commit()

        if (OnButtonClicked("Bermet", "Memento")) {
            val transaction = supportFragmentManager.beginTransaction()
                .remove(Fragment1())
                .add(R.id.fragment_container, Fragment2())
        }
    }
}

