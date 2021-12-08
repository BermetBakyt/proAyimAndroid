package com.ber.progayim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ber.progayim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), initFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initFragment()
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.apply() {
            val pref = getSharedPreferences("MyAppPrefs", MODE_PRIVATE)

            text.text = pref.getString(KEY_TEXT, "defValue")

            btn.setOnClickListener {
                val editor = pref.edit()
                editor.putString(KEY_TEXT, edit.text.toString())
                editor.apply()
            }
        }
    }

    private fun initFragment() {
        val intent = Intent(this, Fragment1())
    }

    companion object {
        private const val KEY_TEXT = "keyText"
    }
}