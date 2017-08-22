package com.hucet.dagger

import android.app.Application
import com.hucet.dagger.di.*
import com.hucet.dagger.provide.DripCoffeeModule
import com.hucet.dagger.subcomponent.parent.DaggerServerComponent
import com.hucet.dagger.subcomponent.parent.ServerComponent
import com.hucet.dagger.subcomponent.scope.ScopeComponent

/**
 * Created by tyler on 2017. 8. 16..
 */
class MyApplication : Application() {

    companion object {
        lateinit var coffeeShop: CoffeeShop
        lateinit var serverComponent: ServerComponent
    }

    override fun onCreate() {
        super.onCreate()
        initGraph()
    }

    fun initGraph() {
        serverComponent = DaggerServerComponent.create()
        val scopeComponent = serverComponent.scopeInject()
        scopeComponent.scopeMaker1()
        scopeComponent.scopeMaker2()
    }


}