package com.ocean.demounittest.shoppingListTestYT

import androidx.lifecycle.LiveData
import com.ocean.demounittest.shoppingListTestingYT.data.local.ShoppingItem
import com.ocean.demounittest.shoppingListTestingYT.data.remote.responses.ImageResponse
import com.ocean.demounittest.shoppingListTestingYT.repositories.ShoppingRepository
import retrofit2.Response

class FakeShoppingRepository: ShoppingRepository {
    override suspend fun insertShoppingItem(shoppingItem: ShoppingItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteShoppingItem(shoppingItem: ShoppingItem) {
        TODO("Not yet implemented")
    }

    override fun observeAllShoppingItems(): LiveData<List<ShoppingItem>> {
        TODO("Not yet implemented")
    }

    override fun observeTotalPrice(): LiveData<Float> {
        TODO("Not yet implemented")
    }

    override suspend fun searchForImage(imageQuery: String): Response<ImageResponse> {
        TODO("Not yet implemented")
    }
}