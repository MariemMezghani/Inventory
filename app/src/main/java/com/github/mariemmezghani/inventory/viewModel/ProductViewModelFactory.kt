package com.github.mariemmezghani.inventory.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.mariemmezghani.inventory.database.ProductDatabaseDao

class ProductViewModelFactory(private val datasource:ProductDatabaseDao)
                            :ViewModelProvider.Factory{
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductViewModel::class.java)) {
            return ProductViewModel(datasource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}