package com.github.mariemmezghani.inventory.viewModel


import androidx.lifecycle.*
import com.github.mariemmezghani.inventory.database.Product
import com.github.mariemmezghani.inventory.database.ProductDatabaseDao
import kotlinx.coroutines.launch

class ProductViewModel(val database: ProductDatabaseDao) : ViewModel() {
    val products = database.getAllProducts()

    private var _navigateToProductsList = MutableLiveData<Boolean>()

    val navigateToProductsList: LiveData<Boolean>
        get() = _navigateToProductsList
    private val _cancelNavigation = MutableLiveData<Boolean>()

    val cancelNavigation: LiveData<Boolean>
        get() = _cancelNavigation

    private suspend fun insert(product: Product) {
        database.insert(product)
    }

    fun onAddProduct(product: Product) {
        viewModelScope.launch {
            //val product = Product()
            //product.name = "hi"
            insert(product)
            _navigateToProductsList.postValue(true)

        }
    }

    fun onCancel() {
        _cancelNavigation.value = true
    }

    fun doneNavigation() {
        _navigateToProductsList.value = false
    }

    fun navigationCancelled() {
        _cancelNavigation.value = false
    }


}

