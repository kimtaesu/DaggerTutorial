package com.hucet.dagger.model

import android.util.Log

/**
 * Created by tyler on 2017. 8. 17..
 */
class QualifiersHeater constructor(val temp: Number) : Heater {
    var heating: Boolean = false

    override fun on() {
        Log.e("!!!!!!!!!!", "~ ~ ~ heating ~ ~ ~ ${temp}")
        this.heating = true
    }

    override fun off() {
        this.heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }
}
