package com.ber.progayim

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment_2) {
    private lateinit var image: ImageView
    private lateinit var listener: OnClickListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image = view.findViewById(R.id.fragment2_img1)

        }

    fun setValue(value: ImageView) {
        image.setImageResource(R.mipmap.img1)
        image.setImageResource(R.mipmap.img2)
        image.setImageResource(R.mipmap.img3)
        }
}