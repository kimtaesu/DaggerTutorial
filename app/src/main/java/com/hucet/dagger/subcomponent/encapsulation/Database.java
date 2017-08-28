package com.hucet.dagger.subcomponent.encapsulation;

import javax.inject.Inject;

/**
 * Created by tyler on 2017. 8. 28..
 */

public class Database {
    @Inject
    public Database() {
        System.out.println("Database");
    }
}
