package com.hucet.dagger.subcomponent.encapsulation;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

/**
 * Created by tyler on 2017. 8. 22..
 */

@Singleton
@Component(modules = DatabaseModule.class)
interface ApplicationComponent {
    Database database();
}

@Module(subcomponents = DatabaseComponent.class)
class DatabaseModule {
    @Provides
    @Singleton
    Database provideDatabase(
//            @NumberOfCores int numberOfCores,
            DatabaseComponent.Builder databaseComponentBuilder) {
        return databaseComponentBuilder
//                .databaseImplModule(new DatabaseImplModule(numberOfCores / 2))
                .databaseImplModule(new DatabaseImplModule(2))
                .build()
                .database();
    }
}

@Module
class DatabaseImplModule {
    DatabaseImplModule(int concurrencyLevel) {
    }

    @Provides
    DatabaseConnectionPool provideDatabaseConnectionPool() {
        return new DatabaseConnectionPool();
    }

    @Provides
    DatabaseSchema provideDatabaseSchema() {
        return new DatabaseSchema();
    }
}

@PrivateToDatabase
@Subcomponent(modules = DatabaseImplModule.class)
interface DatabaseComponent {
    @PrivateToDatabase
    Database database();

    @Subcomponent.Builder
    interface Builder {

        Builder databaseImplModule(DatabaseImplModule a);

        DatabaseComponent build();
    }
}