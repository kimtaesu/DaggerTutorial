package com.hucet.dagger.di.modules

import com.hucet.dagger.inject.construct.Thermosiphon
import com.hucet.dagger.model.Pump
import dagger.Binds
import dagger.Module


/**
 * Created by tyler on 2017. 8. 17..
 */
@Module
abstract class PumpModule {
    @Binds
    abstract fun providePump(pump: Thermosiphon): Pump
}

//@Module
//interface PumpModule {
//    @Binds
//    fun providePump(pump: Thermosiphon): Pump
//}