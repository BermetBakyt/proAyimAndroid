package com.ber.progayim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ber.progayim.databinding.Fragment1Binding

class Fragment1 : Fragment(R.layout.fragment_1) {
private var _binding: Fragment1Binding ?= null
private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = Fragment1Binding.bind(view)

        binding.apply {
            frgTxt.text = "Kotiki"
            btnToast.setOnClickListener {
                Toast.makeText(requireContext(), "Toast", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}