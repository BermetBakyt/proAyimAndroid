package com.ber.progayim

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFragment()

    }

    private fun initFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, Fragment2())
            .commit()
    }
}