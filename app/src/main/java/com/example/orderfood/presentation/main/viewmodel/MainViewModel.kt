package com.example.orderfood.presentation.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.orderfood.data.model.FoodsModel
import com.example.orderfood.domain.usecase.GetFoodsUseCaseImpl
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val useCaseImpl: GetFoodsUseCaseImpl
): ViewModel() {

    fun getFoods(apiKey: String): MutableLiveData<FoodsModel> {
        return useCaseImpl.getFoods(apiKey = apiKey)
    }

}