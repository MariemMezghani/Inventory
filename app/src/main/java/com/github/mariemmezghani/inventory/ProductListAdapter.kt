package com.github.mariemmezghani.inventory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.github.mariemmezghani.inventory.database.Product
import com.github.mariemmezghani.inventory.databinding.ProductItemViewBinding

class ProductListAdapter:androidx.recyclerview.widget.ListAdapter<Product,ProductListAdapter.ViewHolder>(ProductDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = getItem(position)
        holder.bind(item)
    }

    class ViewHolder private constructor(val binding: ProductItemViewBinding): RecyclerView.ViewHolder(binding.root){

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ProductItemViewBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
       fun bind(item: Product) {
           binding.product=item
           binding.executePendingBindings()

       }

    }
}

class ProductDiffUtil: DiffUtil.ItemCallback<Product>(){
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem==newItem
    }

}