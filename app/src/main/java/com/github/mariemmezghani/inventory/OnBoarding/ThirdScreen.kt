package com.github.mariemmezghani.inventory.OnBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.github.mariemmezghani.inventory.R
import com.github.mariemmezghani.inventory.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentThirdScreenBinding>(
            inflater, R.layout.fragment_third_screen, container, false
        )

        binding.startButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(ThirdScreenDirections.actionThirdScreenToProductsListFragment())
        }
        return binding.root
    }

}