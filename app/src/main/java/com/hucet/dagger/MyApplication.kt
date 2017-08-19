package com.hucet.dagger

import android.app.Application
import com.hucet.dagger.di.*

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
        componentCreateTest()
    }

    fun initGraph() {
        coffeeShop = DaggerCoffeeShop
                .builder()
                .build()
    }

    fun componentCreateTest() {
        DaggerCoffeeShop.create().maker().brew()
    }
}