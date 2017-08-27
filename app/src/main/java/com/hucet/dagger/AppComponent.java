package com.hucet.dagger;

import javax.inject.Inject;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by taesu on 2017-08-27.
 */

@Component(modules = AppModule.class)
interface AppComponent {
    App app();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder userName(@UserName String userName);

        AppComponent build();
    }
}

@Module
class AppModule {
}

class App {

    private String userName;

    @Inject
    public App(@UserName String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}


