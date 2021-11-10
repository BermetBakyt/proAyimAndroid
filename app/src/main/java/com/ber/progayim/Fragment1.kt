package com.ber.progayim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<AppCompatButton>(R.id.btn1)
        btn.setOnClickListener{
            Toast.makeToast(requireContext()), "this is Toast"
        }
    }
}