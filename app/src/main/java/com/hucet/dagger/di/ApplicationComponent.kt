package com.hucet.dagger.di

import com.hucet.dagger.inject.field.CoffeMaker
import com.hucet.dagger.provide.DripCoffeeModuleJava
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tyler on 2017. 8. 16..
 */
@Singleton
@Component(modules = arrayOf(DripCoffeeModuleJava::class))
//@Component(modules = arrayOf(DripCoffeeModule::class))
interface CoffeeShop {
    //    fun maker(): CoffeMaker
    fun maker(): CoffeMaker
}

class Foo {
    class Bar {
        @Component
        interface BazComponent
    }
}

