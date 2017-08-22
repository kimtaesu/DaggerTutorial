package com.hucet.dagger.subcomponent.scope;

import com.hucet.dagger.MainActivity;
import com.hucet.dagger.subcomponent.RequestComponent;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by tyler on 2017. 8. 22..
 */

@ScopeScope
@Subcomponent(modules = ScopeModule.class)
public interface ScopeComponent {
    ScopeMaker1 scopeMaker1();

    ScopeMaker2 scopeMaker2();
}