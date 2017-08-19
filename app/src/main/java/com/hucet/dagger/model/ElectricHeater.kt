package com.hucet.dagger.model

/**
 * Created by tyler on 2017. 8. 17..
 */
internal class ElectricHeater : Heater {
    var heating: Boolean = false

    override fun on() {
        println("~ ~ ~ heating ~ ~ ~")
        this.heating = true
    }

    override fun off() {
        this.heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }
}
