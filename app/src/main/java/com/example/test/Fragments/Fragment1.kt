package com.example.test.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.test.R
import com.example.test.viewModel.EjemploFragment2ViewModel

class Fragment1 : Fragment() {

    lateinit var  v: View
    lateinit var login: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.ejemplo_fragment, container, false)

        login = v.findViewById(R.id.btnLogin)
        return v
    }

    override fun onStart() {
        super.onStart()

        login.setOnClickListener {
            var action2 = Fragment1Directions.actionFragment12ToFragment2()
            v.findNavController().navigate(action2)
        }
    }

}