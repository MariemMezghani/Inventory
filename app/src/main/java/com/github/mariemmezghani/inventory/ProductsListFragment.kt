package com.github.mariemmezghani.inventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.github.mariemmezghani.inventory.database.ProductDatabase
import com.github.mariemmezghani.inventory.database.ProductDatabaseDao
import com.github.mariemmezghani.inventory.databinding.FragmentProductsListBinding
import com.github.mariemmezghani.inventory.viewModel.ProductViewModel
import com.github.mariemmezghani.inventory.viewModel.ProductViewModelFactory

class ProductsListFragment : Fragment() {

    private val productViewModel: ProductViewModel by activityViewModels {
        ProductViewModelFactory(
            getDatabase()
        )
    }

    //Inflating and Returning the View with DataBindingUtil
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentProductsListBinding>(
            inflater, R.layout.fragment_products_list, container, false
        )
        binding.addButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(ProductsListFragmentDirections.actionProductsListFragmentToProductDetailFragment())
        }

        binding.lifecycleOwner = this
        binding.viewModel = productViewModel

        return binding.root
    }

    fun getDatabase(): ProductDatabaseDao {
        val application = requireNotNull(this.activity).application
        val dataSource = ProductDatabase.getInstance(application).productDatabaseDao
        return dataSource
    }
}