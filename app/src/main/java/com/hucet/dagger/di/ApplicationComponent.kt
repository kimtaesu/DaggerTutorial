package com.hucet.dagger.di

import com.hucet.dagger.di.modules.ApplicationModule
import com.hucet.dagger.di.modules.DripCoffeeModule
import com.hucet.dagger.inject.field.CoffeMaker
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tyler on 2017. 8. 16..
 */
@Singleton
@Component(modules = arrayOf(DripCoffeeModule::class))
interface CoffeeShop {
    fun maker(): CoffeMaker
}

class Foo {
    class Bar {
        @Component
        interface BazComponent
    }
}

