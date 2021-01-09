package com.github.mariemmezghani.inventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.github.mariemmezghani.inventory.database.Product
import com.github.mariemmezghani.inventory.database.ProductDatabase
import com.github.mariemmezghani.inventory.database.ProductDatabaseDao
import com.github.mariemmezghani.inventory.databinding.FragmentProductDetailBinding
import com.github.mariemmezghani.inventory.viewModel.ProductViewModel
import com.github.mariemmezghani.inventory.viewModel.ProductViewModelFactory


class ProductDetailFragment : Fragment() {
    private val productViewModel: ProductViewModel by activityViewModels {
        ProductViewModelFactory(
            getDatabase()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentProductDetailBinding>(
            inflater,
            R.layout.fragment_product_detail,
            container,
            false
        )

        binding.lifecycleOwner = this
        binding.productViewModel = productViewModel
        binding.product=Product(name = "")
        productViewModel.navigateToProductsList.observe(viewLifecycleOwner, Observer {
            if (it == true) {
                this.findNavController()
                    .navigate(ProductDetailFragmentDirections.actionProductDetailFragmentToProductsListFragment())
                // Reset state to make sure we only navigate once, even if the device
                // has a configuration change
                productViewModel.doneNavigation()
            }

        })
        productViewModel.cancelNavigation.observe(viewLifecycleOwner, Observer {
            if (it==true){
                this.findNavController().navigate(ProductDetailFragmentDirections.actionProductDetailFragmentToProductsListFragment())

            }
            productViewModel.navigationCancelled()
        })
        return binding.root
    }

    fun getDatabase(): ProductDatabaseDao {
        val application = requireNotNull(this.activity).application
        val dataSource = ProductDatabase.getInstance(application).productDatabaseDao
        return dataSource
    }
}