package com.github.mariemmezghani.inventory

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.github.mariemmezghani.inventory.database.Product
import kotlinx.android.synthetic.main.product_item_view.view.*

@BindingAdapter("setProductName")
fun TextView.setProductName(item: Product?){
    item?.let{
        text=it.name

    }
}
@BindingAdapter("setQuantity")
fun TextView.setQuantity(item: Product?) {
    item?.let {
        text = "Quantity: " + it.quantity.toString()

    }
}
@BindingAdapter("setStockPrice")
fun TextView.setStockPrice(item: Product?) {
    item?.let {
        text = "Stock price: " + it.stock_price.toString()

    }
}