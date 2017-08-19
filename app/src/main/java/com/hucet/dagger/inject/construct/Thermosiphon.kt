package com.hucet.dagger.inject.construct

import com.hucet.dagger.model.Heater
import com.hucet.dagger.model.Pump
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by tyler on 2017. 8. 16..
 */
class Thermosiphon @Inject constructor(val heater: Heater) : Pump {
    override fun pump() {
        if (heater.isHot()) {
            println("=> => pumping => =>");
        }
    }
}