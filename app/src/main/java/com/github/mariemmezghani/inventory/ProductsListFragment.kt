package com.github.mariemmezghani.inventory

import android.os.Bundle
import android.view.*
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.github.mariemmezghani.inventory.database.ProductDatabase
import com.github.mariemmezghani.inventory.database.ProductDatabaseDao
import com.github.mariemmezghani.inventory.databinding.FragmentProductsListBinding
import com.github.mariemmezghani.inventory.databinding.ProductItemViewBinding
import com.github.mariemmezghani.inventory.viewModel.ProductViewModel
import com.github.mariemmezghani.inventory.viewModel.ProductViewModelFactory


class ProductsListFragment : Fragment() {
    private lateinit var parent: ViewGroup
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
        if (container != null) {
            parent = container
        }
        val binding = DataBindingUtil.inflate<FragmentProductsListBinding>(
            inflater, R.layout.fragment_products_list, container, false
        )
        binding.addButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(ProductsListFragmentDirections.actionProductsListFragmentToProductDetailFragment())
        }

        binding.lifecycleOwner = this
        binding.viewModel = productViewModel
        /**
         * As per requirements ,do not use Recyclerview, must use Scrollview
         * and inflate layouts manually
         */
        //adapter
        //val adapter = ProductListAdapter()
        // binding.recyclerview.adapter = adapter
        productViewModel.products.observe(viewLifecycleOwner, Observer {
            it?.let {
                //adapter.submitList(it)
                //clear the list
                binding.listProducts.removeAllViews()
                //add the list when new elements are triggered
                for (product in it) {
                    val productBinding = DataBindingUtil.inflate<ProductItemViewBinding>(
                        layoutInflater, R.layout.product_item_view, parent, false
                    )
                    productBinding.product = product
                    binding.listProducts.addView(productBinding.root)
                }


            }
        })

        //menu
        setHasOptionsMenu(true)

        return binding.root
    }

    fun getDatabase(): ProductDatabaseDao {
        val application = requireNotNull(this.activity).application
        val dataSource = ProductDatabase.getInstance(application).productDatabaseDao
        return dataSource
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            requireView().findNavController()
        ) || super.onOptionsItemSelected(item)

    }
}