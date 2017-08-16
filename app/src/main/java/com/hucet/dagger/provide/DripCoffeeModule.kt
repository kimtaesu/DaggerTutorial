package com.hucet.dagger.provide

import com.hucet.dagger.inject.Heater
import com.hucet.dagger.inject.Pump
import com.hucet.dagger.inject.construct.Thermosiphon
import dagger.Module
import dagger.Provides

/**
 * Created by tyler on 2017. 8. 16..
 */

@Module
class DripCoffeeModule {
    @Provides
    fun provideHeater(): Heater {
        return Heater()
    }

    @Provides
    fun providePump(pump: Thermosiphon): Pump {
        return pump
    }
}