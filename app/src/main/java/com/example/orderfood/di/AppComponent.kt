package com.example.orderfood.di

import com.example.orderfood.presentation.main.MainActivity
import dagger.Component

@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

}