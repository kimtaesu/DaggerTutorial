package com.hucet.dagger.provide;

import android.util.Log;

import com.hucet.dagger.inject.construct.Thermosiphon;
import com.hucet.dagger.model.ElectricHeater;
import com.hucet.dagger.model.Heater;
import com.hucet.dagger.model.Pump;

import org.jetbrains.annotations.Contract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by taesu on 2017-08-20.
 */
@Module
public class DripCoffeeModuleJava {
    @Provides
    public static Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    public static Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
