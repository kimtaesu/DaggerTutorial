package com.hucet.dagger.subcomponent;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by tyler on 2017. 8. 22..
 */
@ImplitScope
@Subcomponent(modules = RequestModule.class)
public interface RequestComponent {
    RequestHandler requestHandler();

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder data(String data);

        RequestComponent build();

    }
}