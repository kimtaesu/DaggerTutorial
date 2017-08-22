package com.hucet.dagger.subcomponent.scope;

import javax.inject.Inject;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class ScopeMaker2 {
    @Inject
    public ScopeMaker2(ScopeObject scopeObject) {
        scopeObject.something();
    }
}
