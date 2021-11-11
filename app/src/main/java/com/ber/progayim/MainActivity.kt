package com.ber.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    private lateinit var txt: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.count)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
        val btn4 = findViewById<AppCompatButton>(R.id.btn4)

        txt.text = supportFragmentManager.backStackEntryCount.toString()
        supportFragmentManager.addOnBackStackChangedListener {  }
        btn1.setOnClickListener(::onClick)
        btn2.setOnClickListener(::onClick)
        btn3.setOnClickListener(::onClick)

        btn4.setOnClickListener{
            // popBackStack вызывает "назад" у кнопки. Первый 0 означает вернуться на первый фрагмент, 2-ой 0 показвывает последний stack-фрагмент. 2-ой 1 возвращает первоначальное состояние без показа первого фрагмента.
            supportFragmentManager.popBackStack(0,0)
        }
    }
    private fun onClick(v:View) {
        val transaction = supportFragmentManager.beginTransaction()
        val pair = when (v.id) {
            R.id.btn1 -> {
             Fragment1() to Fragment1.TAG
            }
            R.id.btn2 -> {
                Fragment2() to Fragment2.TAG
            } else -> {
                Fragment3() to Fragment3.TAG
            }
        }

        // Chooses which fragment show on screen
//        val fragment = when (v.id) {
//            R.id.btn1 -> Fragment1()
//            R.id.btn1 -> Fragment2()
//            else -> Fragment3()
//        }
//         ---этот кусок кода делает то же самое что и transaction.replace(null) разница двух способов:remove-add  - сохраняет состояние фрагмента, replace не сохраняет
//        val fragmentFind = supportFragmentManager.findFragmentById(R.id.fragment_container)
//        if (fragmentFind != null) {
//            transaction.remove(fragmentFind)
//        }
//        transaction.add(R.id.fragment_container, fragment)
//         ----------
//        transaction.add(R.id.fragment_container, fragment)
        transaction.add(R.id.fragment_container, pair.first, pair.second)
        transaction.addToBackStack(pair.second)
        transaction.commit()
    }
}

