package com.hucet.dagger

import android.app.Application
import com.hucet.dagger.di.*
import com.hucet.dagger.provide.DripCoffeeModule
import com.hucet.dagger.subcomponent.encapsulation.ApplicationComponentFirst
import com.hucet.dagger.subcomponent.encapsulation.DaggerApplicationComponentFirst

/**
 * Created by tyler on 2017. 8. 16..
 */
class MyApplication : Application() {

    companion object {
        lateinit var applicationComponentFirst: ApplicationComponentFirst
    }

    override fun onCreate() {
        super.onCreate()
        initGraph()
    }

    fun initGraph() {
        applicationComponentFirst = DaggerApplicationComponentFirst.create()
    }

}