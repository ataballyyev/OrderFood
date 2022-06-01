package com.example.orderfood.data.service

import com.example.orderfood.data.model.FoodsModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodService {

    @GET("/feeds/list")
    fun getFoods(
        @Query("rapidapi-key") apiKey: String
    ): Call<FoodsModel>
}