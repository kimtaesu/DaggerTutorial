package com.hucet.dagger.di

import dagger.Component
import javax.inject.Singleton

/**
 * Created by tyler on 2017. 8. 16..
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

}