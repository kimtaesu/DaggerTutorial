package com.hucet.dagger

import android.app.Application
import com.hucet.dagger.di.ApplicationComponent
import com.hucet.dagger.di.DaggerApplicationComponent

/**
 * Created by tyler on 2017. 8. 16..
 */
class MyApplication : Application() {

    companion object {
        lateinit var applicationComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initGraph()
    }

    fun initGraph() {
        applicationComponent = DaggerApplicationComponent
                .builder()
                .build()
    }
}