package com.hucet.dagger.inject.field;

import android.util.Log;

import com.hucet.dagger.model.Heater;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class ExpensiveCoffeeMaker {
    @Inject
    @Named("water")
    Heater waterHeater;
    @Inject
    @Named("hot plate")
    Heater hotPlateHeater;

    @Inject
    public ExpensiveCoffeeMaker() {
    }

    public void brew() {
        Log.e("!!!!!!!!!", "waterHeater");
        waterHeater.on();
        Log.e("!!!!!!!!!", "hotPlateHeater");
        hotPlateHeater.on();
    }
}
