package com.hucet.dagger.subcomponent;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class RequestHandler {

    @Inject
    public RequestHandler() {
    }

    public void writeResponse(int code, String message) {
        Log.e("!!!!!!!!!", "writeResponse code : " + code + " / message : " + message);
    }
}
