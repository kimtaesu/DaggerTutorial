package com.hucet.dagger.subcomponent;


import javax.inject.Inject;

import dagger.releasablereferences.ForReleasableReferences;
import dagger.releasablereferences.ReleasableReferenceManager;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class RequestHandler {


    @Inject
    public RequestHandler() {
    }

    public void writeResponse(int code, String message) {

    }
}
