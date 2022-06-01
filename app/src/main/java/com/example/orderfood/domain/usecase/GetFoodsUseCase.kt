package com.example.orderfood.domain.usecase

import androidx.lifecycle.MutableLiveData
import com.example.orderfood.data.model.FoodsModel

interface GetFoodsUseCase {

    fun getFoods(apiKey: String): MutableLiveData<FoodsModel>
}