package com.ber.progayim

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnClickListener
    private lateinit var image: AppCompatImageView
    override fun onAttach(context: Context) {
        super.onAttach(context)
        context as OnClickListener
        listener = context as OnClickListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn1 = view.findViewById<AppCompatButton>(R.id.fragment1_btn)
        val btn2 = view.findViewById<AppCompatButton>(R.id.fragment1_btn2)
        val btn3 = view.findViewById<AppCompatButton>(R.id.fragment1_btn3)

        btn1.setOnClickListener(::onClick)
        btn2.setOnClickListener(::onClick)
        btn3.setOnClickListener(::onClick)
    }
    private fun onClick(view: View) {
        when(view.id) {
            R.id.fragment1_btn -> {
                listener.onClicked()
            }
            R.id.fragment1_btn2 -> {

            }
    }
//
    }
}