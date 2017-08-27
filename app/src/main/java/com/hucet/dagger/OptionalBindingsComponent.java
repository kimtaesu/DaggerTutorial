package com.hucet.dagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import dagger.BindsOptionalOf;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by taesu on 2017-08-27.
 */
@Component(modules = OptionalBindingsModule.class)
interface OptionalBindingsComponent {
    Optional<CoffeCozy> coffeCozy();
}


@Module
abstract class OptionalBindingsModule {

    @Provides
    static Optional<CoffeCozy> optionalCozy() {
        Optional<CoffeCozy> optional = new ArrayList<CoffeCozy>().stream().findAny();
        return optional;
    }

    @BindsOptionalOf
    abstract CoffeCozy optionalCozy2();
}

class CoffeCozy {
    public CoffeCozy() {
    }
}