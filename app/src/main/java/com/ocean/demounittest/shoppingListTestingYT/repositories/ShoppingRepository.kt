package com.ocean.demounittest.shoppingListTestingYT.repositories

import retrofit2.Response
import androidx.lifecycle.LiveData
import com.ocean.demounittest.shoppingListTestingYT.data.local.ShoppingItem
import com.ocean.demounittest.shoppingListTestingYT.data.remote.responses.ImageResponse

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery : String): Response<ImageResponse>

}