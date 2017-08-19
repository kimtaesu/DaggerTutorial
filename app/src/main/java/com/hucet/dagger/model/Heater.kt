package com.hucet.dagger.model

/**
 * Created by tyler on 2017. 8. 16..
 */
interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}