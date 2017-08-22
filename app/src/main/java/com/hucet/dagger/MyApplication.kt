package com.hucet.dagger

import android.app.Application
import com.hucet.dagger.di.*
import com.hucet.dagger.provide.DripCoffeeModule

/**
 * Created by tyler on 2017. 8. 16..
 */
class MyApplication : Application() {

    companion object {
        lateinit var coffeeShop: CoffeeShop
    }

    override fun onCreate() {
        super.onCreate()
        initGraph()
//        componentCreateTest()
    }

    fun initGraph() {
        coffeeShop = DaggerCoffeeShop
                .builder()
                .build()
        coffeeShop.expensiveCoffeeMaker().brew()
    }

    fun componentCreateTest() {
        DaggerCoffeeShop.create().maker().brew()
    }
}