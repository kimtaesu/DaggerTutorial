package com.hucet.dagger;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by taesu on 2017-08-27.
 */
@Singleton
@Component(modules = AppModule.class)
interface AppComponent {
    App app();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder userName(@UserName String userName/*, Object test*/);

        AppComponent build();
    }
}

@Module
class AppModule {

    @Provides
    public Object provideObject() {
        return new Object();
    }
}

class App {
    private String userName;

    public Provider<Object> getObjectProvider() {
        return objectProvider;
    }

    private Provider<Object> objectProvider;

    @Inject
    public App(@UserName String userName, Provider<Object> objectProvider) {
        this.userName = userName;
        this.objectProvider = objectProvider;
    }

    public String getUserName() {
        return userName;
    }
}


