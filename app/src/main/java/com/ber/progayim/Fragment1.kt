package com.ber.progayim

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnButtonClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<AppCompatEditText>(R.id.btn_register)

        btn.setOnClickListener(::onClick)
    }
    private fun onClick(view: View) {
        // как сюда передать???
        // если (пользователь ввел "Bermet", "Memento"){
        // перейти на след фрагмент

        // }else -> {"Password is incorrect!"}

        }
    }
