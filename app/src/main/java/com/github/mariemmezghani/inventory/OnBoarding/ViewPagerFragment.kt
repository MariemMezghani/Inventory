package com.github.mariemmezghani.inventory.OnBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentViewHolder
import com.github.mariemmezghani.inventory.R
import com.github.mariemmezghani.inventory.databinding.FragmentViewPagerBinding

class ViewPagerFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentViewPagerBinding>(
            inflater, R.layout.fragment_view_pager, container, false)
        val fragmentList= arrayListOf<Fragment>(FirstScreen(), SecondScreen(), ThirdScreen())
        val adapter=ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)
        binding.viewPager.adapter=adapter
        return binding.root
    }
}