package com.example.orderfood.di

import com.example.orderfood.data.service.FoodService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provide(): FoodService {
        return Retrofit.Builder()
            .baseUrl("https://yummly2.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FoodService::class.java)
    }

}