package com.ocean.demounittest.shoppingListTestingYT.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ocean.demounittest.shoppingListTestingYT.data.local.ShoppingItem
import com.ocean.demounittest.shoppingListTestingYT.data.remote.responses.ImageResponse
import com.ocean.demounittest.shoppingListTestingYT.other.Resource
import com.ocean.demounittest.shoppingListTestingYT.repositories.ShoppingRepository
import retrofit2.Response

class FakeShoppingRepository: ShoppingRepository {

    private val shoppingItems = mutableListOf<ShoppingItem>()
    private val observableShoppingItems = MutableLiveData<List<ShoppingItem>>(shoppingItems)
    private val observableTotalPrice = MutableLiveData<Float>()

    private var shouldReturnNetworkError = false

    fun setShouldReturnNetworkError(value: Boolean){
        shouldReturnNetworkError = value
    }

    private fun refershLiveData(){
        observableShoppingItems.postValue(shoppingItems)
        observableTotalPrice.postValue(getTotalPrice())
    }

    private fun getTotalPrice(): Float{
        return shoppingItems.sumByDouble { it.price.toDouble() }.toFloat()
    }

    override suspend fun insertShoppingItem(shoppingItem: ShoppingItem) {
        shoppingItems.add(shoppingItem)
        refershLiveData()
    }

    override suspend fun deleteShoppingItem(shoppingItem: ShoppingItem) {
        shoppingItems.remove(shoppingItem)
        refershLiveData()
    }

    override fun observeAllShoppingItems(): LiveData<List<ShoppingItem>> {
        return observableShoppingItems
    }

    override fun observeTotalPrice(): LiveData<Float> {
        return observableTotalPrice
    }

    override suspend fun searchForImage(imageQuery: String): Resource<ImageResponse> {
        return if (shouldReturnNetworkError){
            Resource.error("Error", null)
        }else{
            Resource.success(ImageResponse(listOf(),0,0))
        }
    }
}