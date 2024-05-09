package com.ocean.demounittest.shopingListTestingYT.other

import android.net.http.UrlRequest.Status

data class Resource<out T>(val status: Status, val data: T?, val message: String?){
    companion object{
//        fun <T> success(data: T?): Resource<T>{
//            return Resource(com.ocean.demounittest.shopingListTestingYT.other.Status.SUCCESS, data, null)
//        }
    }
}

enum class Status{
    SUCCESS,
    ERROR,
    LOADING
}