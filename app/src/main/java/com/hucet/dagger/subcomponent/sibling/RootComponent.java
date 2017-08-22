package com.hucet.dagger.subcomponent.sibling;

import com.hucet.dagger.subcomponent.RequestComponent;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by tyler on 2017. 8. 22..
 */
@RootScope
@Component
interface RootComponent {
    SessionComponent.Builder sessionComponent();
}

@SessionScope
@Subcomponent
interface SessionComponent {
    FooRequestComponent.Builder fooRequestComponent();

    BarRequestComponent.Builder barRequestComponent();

    @Subcomponent.Builder
    interface Builder {
        SessionComponent build();

    }
}

@RequestScope
@Subcomponent
interface FooRequestComponent {
    @Subcomponent.Builder
    interface Builder {
        FooRequestComponent build();

    }
}

@RequestScope
@Subcomponent
interface BarRequestComponent {
    @Subcomponent.Builder
    interface Builder {
        BarRequestComponent build();

    }
}
