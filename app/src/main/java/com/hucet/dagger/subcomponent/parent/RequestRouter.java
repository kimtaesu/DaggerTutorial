package com.hucet.dagger.subcomponent.parent;

import android.provider.ContactsContract;

import com.hucet.dagger.subcomponent.RequestComponent;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

/**
 * Created by tyler on 2017. 8. 22..
 */

@Singleton
public class RequestRouter {
    @Inject
    Provider<RequestComponent.Builder> requestComponentProvider;

    @Inject
    RequestRouter() {
    }

    public void dataReceived(String data) {
        RequestComponent requestComponent = requestComponentProvider.get()
                .data(data)
                .build();

        requestComponent.requestHandler()
                .writeResponse(200, "hello, world");
    }
}