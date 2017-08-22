package com.hucet.dagger.subcomponent.parent;


import com.hucet.dagger.subcomponent.RequestComponent;

import dagger.Module;

/**
 * Created by tyler on 2017. 8. 22..
 */
@Module(subcomponents = RequestComponent.class)
public class ServerModule {
}