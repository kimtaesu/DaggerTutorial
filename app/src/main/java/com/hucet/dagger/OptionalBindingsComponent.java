package com.hucet.dagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.BindsOptionalOf;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by taesu on 2017-08-27.
 */
@Component(modules = OptionalBindingsModule.class)
interface OptionalBindingsComponent {
    @Named("coffeCozy") Optional<CoffeCozy> coffeCozy();
}


@Module
abstract class OptionalBindingsModule {

//    @Provides
//    static Optional<CoffeCozy> optionalCozy() {
//        Optional<CoffeCozy> optional = new ArrayList<CoffeCozy>().stream().findAny();
//        return optional;
//    }

    @BindsOptionalOf
    @Named("coffeCozy")
    abstract CoffeCozy optionalCozy2();

    @Provides
    @Named("coffeCozy")
    static CoffeCozy coffeCozy()
    {
        return new CoffeCozy();
    }

    @Provides
    @Named("coffeCozy2")
    static CoffeCozy coffeCozy2()
    {
        return new CoffeCozy();
    }
}

class CoffeCozy {
    public CoffeCozy() {
    }
}