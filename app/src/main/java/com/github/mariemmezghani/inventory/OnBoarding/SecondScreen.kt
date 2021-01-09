package com.github.mariemmezghani.inventory.OnBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.github.mariemmezghani.inventory.R
import com.github.mariemmezghani.inventory.databinding.FragmentSecondScreenBinding


class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondScreenBinding>(
            inflater, R.layout.fragment_second_screen, container, false
        )
        binding.nextButton2.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(SecondScreenDirections.actionSecondScreenToThirdScreen())
        }
        return binding.root
    }

}