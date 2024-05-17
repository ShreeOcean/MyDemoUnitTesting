package com.ocean.demounittest.shoppingListTestingYT.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ocean.demounittest.R
import com.ocean.demounittest.databinding.FragmentAddShoppingItemBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddShoppingItemFragment : Fragment(R.layout.fragment_add_shopping_item) {

    private lateinit var binding : FragmentAddShoppingItemBinding
    private lateinit var viewModel: ShoppingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddShoppingItemBinding.inflate(inflater, container, false)
        return binding.root//super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ShoppingViewModel::class.java]

        binding.ivShoppingImage.setOnClickListener {
            findNavController().navigate(AddShoppingItemFragmentDirections.actionAddShoppingItemFragmentToImagePickFragment())
        }

        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                viewModel.setCurImageUrl("")
                findNavController().popBackStack()
            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)
    }
}