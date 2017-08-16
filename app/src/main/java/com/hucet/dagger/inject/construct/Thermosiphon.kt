package com.hucet.dagger.inject.construct

import com.hucet.dagger.inject.Heater
import com.hucet.dagger.inject.Pump
import javax.inject.Inject

/**
 * Created by tyler on 2017. 8. 16..
 */
class Thermosiphon @Inject constructor(val heater: Heater) : Pump {

    override fun someMethod() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}