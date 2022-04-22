package com

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tilegame.MainActivity
import com.example.tilegame.R
import com.example.tilegame.databinding.FragmentPopuplostBinding
import kotlinx.android.synthetic.main.fragment_popuplost.*


class popuplost : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        binding = FragmentPopuplostBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_popuplost, container, false)
//        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnretry2.setOnClickListener {

            val intent = Intent (this@popuplost.context, MainActivity::class.java)
            startActivity(intent)
        }

    }


}