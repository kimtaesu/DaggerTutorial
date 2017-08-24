package com.hucet.dagger

import android.app.Application
import com.hucet.dagger.di.*
import com.hucet.dagger.provide.DripCoffeeModule
import com.hucet.dagger.subcomponent.MyScope
import com.hucet.dagger.subcomponent.parent.DaggerServerComponent
import com.hucet.dagger.subcomponent.parent.ServerComponent
import dagger.releasablereferences.ForReleasableReferences
import dagger.releasablereferences.ReleasableReferenceManager
import javax.inject.Inject

/**
 * Created by tyler on 2017. 8. 16..
 */
class MyApplication : Application() {

    @Inject
    @ForReleasableReferences(MyScope::class)
    lateinit var myScopeReferences: ReleasableReferenceManager
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
        serverComponent.requestRouter().dataReceived("SubComponent")
        serverComponent.requestRouter().dataReceived("data")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        myScopeReferences.releaseStrongReferences()
    }
}