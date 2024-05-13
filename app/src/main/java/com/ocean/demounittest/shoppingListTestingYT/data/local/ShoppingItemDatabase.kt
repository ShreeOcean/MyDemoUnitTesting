package com.ocean.demounittest.shoppingListTestingYT.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ocean.demounittest.shoppingListTestingYT.data.local.ShoppingDao
import com.ocean.demounittest.shoppingListTestingYT.data.local.ShoppingItem

@Database(entities = [ShoppingItem::class], version = 1)
abstract class ShoppingItemDatabase: RoomDatabase() {
    abstract fun shoppingDao(): ShoppingDao
}