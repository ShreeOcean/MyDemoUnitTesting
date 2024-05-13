package com.ocean.demounittest.shoppingListTestingYT.data.remote.responses

data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)