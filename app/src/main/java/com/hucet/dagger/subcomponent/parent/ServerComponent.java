package com.hucet.dagger.subcomponent.parent;

import com.hucet.dagger.subcomponent.RequestComponent;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by tyler on 2017. 8. 22..
 */

@Singleton
@Component(modules = ServerModule.class)
public interface ServerComponent {
    RequestRouter requestRouter();
}



