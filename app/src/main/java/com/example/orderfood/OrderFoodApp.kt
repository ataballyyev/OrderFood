package com.example.orderfood

import android.app.Application
import com.example.orderfood.di.AppComponent
import com.example.orderfood.di.DaggerAppComponent

class OrderFoodApp: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}