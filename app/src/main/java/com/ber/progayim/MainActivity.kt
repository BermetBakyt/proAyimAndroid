package com.ber.progayim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout

// внимательнее к условиям задачи

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var image: ImageView
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

     fun onClickListener(image: ImageView) { // не неужно передавать вьюшку)
        supportFragmentManager.findFragmentById(R.id.container2) as? Fragment2
         fragment2.setValue(image)
    }
}
