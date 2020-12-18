package com.github.mariemmezghani.inventory.OnBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.github.mariemmezghani.inventory.R
import com.github.mariemmezghani.inventory.databinding.FragmentFirstScreenBinding
import com.github.mariemmezghani.inventory.databinding.FragmentSecondScreenBinding
import com.github.mariemmezghani.inventory.databinding.FragmentViewPagerBinding


class SecondScreen : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondScreenBinding>(
            inflater, R.layout.fragment_second_screen, container, false
        )
        return binding.root
    }

}