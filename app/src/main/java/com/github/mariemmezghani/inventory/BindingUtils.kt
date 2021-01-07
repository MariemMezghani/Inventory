package com.github.mariemmezghani.inventory

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.github.mariemmezghani.inventory.database.Product

@BindingAdapter("setProductName")
fun TextView.setProductName(item: Product?){
    item?.let{
        text=it.name

    }

}