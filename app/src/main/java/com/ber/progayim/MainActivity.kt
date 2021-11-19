package com.ber.progayim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ber.progayim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val txt get() = binding.txt1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.txt1
        setContentView(binding.root)

//        txt.text = "scadcsc"
//
//        binding.txt1.text = "sasasasdsasd"
        binding.btnGo.setOnClickListener {

        }
    binding.apply {
        txt1.text = "Hello Kotiki"
        btnGo.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }
    }

    }
}

