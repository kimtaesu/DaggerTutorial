package com.hucet.dagger.subcomponent;

import android.util.Log;

import com.hucet.dagger.CashRegister;
import com.hucet.dagger.CoffeeScooper;

import javax.inject.Inject;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class RequestHandler {

    @Inject
    public RequestHandler(CoffeeScooper coffeeScooper, CashRegister cashRegister) {
        coffeeScooper.printScooper();
    }

    public void writeResponse(int code, String message) {
        Log.e("!!!!!!!!!", "writeResponse code : " + code + " / message : " + message);
    }
}
