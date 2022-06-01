package com.example.orderfood.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.orderfood.data.model.FoodsModel
import com.example.orderfood.data.service.FoodService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class FoodRepository @Inject constructor(private val service: FoodService) {

    val liveDataFoods = MutableLiveData<FoodsModel>()

    fun getFoodsList(apiKey: String): MutableLiveData<FoodsModel> {
        service.getFoods(apiKey = apiKey).enqueue(object : Callback<FoodsModel> {
            override fun onResponse(call: Call<FoodsModel>, response: Response<FoodsModel>) {
                liveDataFoods.postValue(response.body())
                Log.i("RETROFIT", response.body().toString())
            }

            override fun onFailure(call: Call<FoodsModel>, t: Throwable) {
                Log.i("RETROFIT_Error", t.stackTraceToString())
            }
        })

        return liveDataFoods
    }

}