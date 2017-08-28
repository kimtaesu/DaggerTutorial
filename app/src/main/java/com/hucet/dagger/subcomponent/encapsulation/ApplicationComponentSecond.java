package com.hucet.dagger.subcomponent.encapsulation;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by tyler on 2017. 8. 28..
 */


@Singleton
@Component(modules = DatabaseModuleFirst.class)
public interface ApplicationComponentSecond {
    BB bb();
}

@Singleton
class BB {
    @Inject
    public BB(DatabaseComponent.Builder builder) {
        builder.databaseImplModule(new DatabaseImplModule())
                .build()
                .database();
    }
}

@Module(subcomponents = DatabaseComponent.class)
class DatabaseModuleSecond {
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
