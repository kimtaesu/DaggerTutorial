package com.hucet.dagger.inject.field

import com.hucet.dagger.inject.Heater
import com.hucet.dagger.inject.Pump
import javax.inject.Inject

/**
 * Created by tyler on 2017. 8. 16..
 */
class CoffeMaker {
    @Inject lateinit var heater: Heater
    @Inject lateinit var pump: Pump
}