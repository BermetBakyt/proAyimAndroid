package com.ber.progayim

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = when(getText("Bermet")) {
            "Bermet" -> view.findViewById<AppCompatEditText>(R.id.edit_username)
            else -> view.findViewById<AppCompatEditText>(R.id.edit_password)
        }

        }

    private fun getText(s: String) {

    }
}
