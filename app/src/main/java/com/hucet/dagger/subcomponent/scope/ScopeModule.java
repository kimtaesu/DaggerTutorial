package com.hucet.dagger.subcomponent.scope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tyler on 2017. 8. 22..
 */
@Module
public class ScopeModule {
    @Provides
    ScopeObject provideScopeObject() {
        return new ScopeObject();
    }
}
