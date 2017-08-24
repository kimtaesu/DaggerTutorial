package com.hucet.dagger.subcomponent;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by tyler on 2017. 8. 22..
 */

@MyScope
@Subcomponent(modules = RequestModule.class)
public interface RequestComponent {
    RequestHandler requestHandler();

    @Subcomponent.Builder
    interface Builder {
        RequestComponent build();

    }
}