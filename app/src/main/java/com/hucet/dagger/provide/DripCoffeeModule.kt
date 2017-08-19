package com.hucet.dagger.provide

import com.hucet.dagger.model.Heater
import com.hucet.dagger.model.Pump
import com.hucet.dagger.inject.construct.Thermosiphon
import com.hucet.dagger.model.ElectricHeater
import dagger.Module
import dagger.Provides

/**
 * Created by tyler on 2017. 8. 16..
 */

@Module
class DripCoffeeModule {
    @Provides
    fun provideHeater(): Heater {
        return ElectricHeater()
    }

    @Provides
    fun providePump(pump: Thermosiphon): Pump {
        return pump
    }
}