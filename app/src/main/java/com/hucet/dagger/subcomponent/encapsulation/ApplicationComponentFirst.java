package com.hucet.dagger.subcomponent.encapsulation;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by tyler on 2017. 8. 22..
 */

@Singleton
@Component(modules = DatabaseModuleFirst.class)
public interface ApplicationComponentFirst {
    AA aa();
}

@Singleton
class AA {
    @Inject
    public AA(DatabaseComponent.Builder builder) {
        builder.databaseImplModule(new DatabaseImplModule())
                .build()
                .database();
    }
}

@Module(subcomponents = DatabaseComponent.class)
class DatabaseModuleFirst {
//    @Provides
//    @Singleton
//    Database provideDatabase(
//            DatabaseComponent.Builder databaseComponentBuilder) {
//        return databaseComponentBuilder
//                .databaseImplModule(new DatabaseImplModule())
//                .build()
//                .database();
//    }
}
