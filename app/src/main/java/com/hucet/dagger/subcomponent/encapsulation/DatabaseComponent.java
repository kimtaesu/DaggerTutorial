package com.hucet.dagger.subcomponent.encapsulation;

/**
 * Created by tyler on 2017. 8. 28..
 */

import com.hucet.dagger.subcomponent.parent.DatabaseScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

/**
 * Created by tyler on 2017. 8. 28..
 */

@Module
class DatabaseImplModule {
    @Provides
    DatabaseConnectionPool provideDatabaseConnectionPool() {
        return new DatabaseConnectionPool();
    }

    @Provides
    DatabaseSchema provideDatabaseSchema() {
        return new DatabaseSchema();
    }
}

@Subcomponent(modules = DatabaseImplModule.class)
public interface DatabaseComponent {
    Database database();

    @Subcomponent.Builder
    interface Builder {

        Builder databaseImplModule(DatabaseImplModule a);

        DatabaseComponent build();
    }
}