package com.ocean.demounittest.shoppingListTestingYT.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ocean.demounittest.R
import com.ocean.demounittest.databinding.FragmentShoppingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingFragment : Fragment(R.layout.fragment_shopping) {

    private lateinit var viewModel: ShoppingViewModel
    private lateinit var binding: FragmentShoppingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentShoppingBinding.inflate(inflater, container, false)
        return binding.root//super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ShoppingViewModel::class.java]
        binding.fabAddShoppingItem.setOnClickListener {
            findNavController().navigate(ShoppingFragmentDirections.actionShoppingFragmentToAddShoppingItemFragment())
        }
    }
}