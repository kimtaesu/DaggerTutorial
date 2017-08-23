package com.hucet.dagger.inject.field

import com.hucet.dagger.inject.construct.Thermosiphon
import com.hucet.dagger.model.Heater
import com.hucet.dagger.model.Pump
import javax.inject.Inject


/**
 * Created by tyler on 2017. 8. 16..
 */
class CoffeMaker @Inject constructor(val heater: Heater, val pump: Thermosiphon) {

    fun brew() {
        heater.on()
        pump.pump()
        println(" [_]P coffee! [_]P ")
        heater.off()
    }
}