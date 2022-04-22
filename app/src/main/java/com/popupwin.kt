package com

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tilegame.MainActivity
import com.example.tilegame.R
import kotlinx.android.synthetic.main.fragment_popuplost.*
import kotlinx.android.synthetic.main.fragment_popuplost.btnretry2
import kotlinx.android.synthetic.main.fragment_popupwin.*


class popupwin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popupwin, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnretry.setOnClickListener {

            val intent = Intent (this@popupwin.context, MainActivity::class.java)
            startActivity(intent)
        }

    }

}