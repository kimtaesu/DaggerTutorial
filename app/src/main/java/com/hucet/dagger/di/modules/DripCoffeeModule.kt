package com.hucet.dagger.di.modules

import com.hucet.dagger.model.ElectricHeater
import com.hucet.dagger.model.Heater
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by tyler on 2017. 8. 17..
 */
@Module(includes = arrayOf(PumpModule::class))
class DripCoffeeModule {
    @Provides @Singleton fun provideHeater(): Heater {
        println("provideHeater")
        return ElectricHeater()
    }
}
