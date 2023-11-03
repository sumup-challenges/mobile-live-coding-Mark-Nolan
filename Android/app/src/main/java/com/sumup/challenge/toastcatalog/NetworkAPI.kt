package com.sumup.challenge.toastcatalog

import retrofit2.Call
import retrofit2.http.GET


interface NetworkAPI {
    @GET("sumup-challenges/mobile-coding-challenge-data/items/")
    fun getItems() : Call<List<Item>>
}