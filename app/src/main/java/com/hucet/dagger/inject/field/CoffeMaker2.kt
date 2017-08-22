package com.hucet.dagger.inject.field

import com.hucet.dagger.model.Heater
import com.hucet.dagger.model.Pump
import javax.inject.Inject


/**
 * Created by tyler on 2017. 8. 16..
 */
class CoffeMaker2 {

    @Inject lateinit var heater: Heater
    @Inject lateinit var pump: Pump

    //    @Inject
    constructor()

    fun brew() {
        heater.on()
        pump.pump()
        println(" [_]P coffee! [_]P ")
        heater.off()
    }
}