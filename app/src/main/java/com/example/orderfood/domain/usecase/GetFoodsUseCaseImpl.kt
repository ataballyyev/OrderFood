package com.example.orderfood.domain.usecase

import androidx.lifecycle.MutableLiveData
import com.example.orderfood.data.model.FoodsModel
import com.example.orderfood.data.repository.FoodRepository
import javax.inject.Inject

class GetFoodsUseCaseImpl @Inject constructor(private val repository: FoodRepository):
    GetFoodsUseCase {

    override fun getFoods(apiKey: String): MutableLiveData<FoodsModel> {
        return repository.getFoodsList(apiKey = apiKey)
    }

}