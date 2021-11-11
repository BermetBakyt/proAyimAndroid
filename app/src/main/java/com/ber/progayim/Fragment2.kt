package com.ber.progayim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment_2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt = view.findViewById<AppCompatTextView>(R.id.frg2_txt)

        txt.setOnClickListener {
            Toast.makeText(requireContext(), "This is Fragment 2 !!!", Toast.LENGTH_SHORT).show()
        }

    }
}

