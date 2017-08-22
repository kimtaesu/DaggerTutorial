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
    BadChildComponent.Builder badChildComponent(); // ERROR!

    SiblingComponentOne.Builder siblingComponentOne();

    SiblingComponentTwo.Builder siblingComponentTwo();
}

@RootScope
@Subcomponent
interface BadChildComponent {
    @Subcomponent.Builder
    interface Builder {
        BadChildComponent build();
    }
}

@ChildScope
@Subcomponent
interface SiblingComponentOne {
    @Subcomponent.Builder
    interface Builder {
        SiblingComponentOne build();

    }
}

@ChildScope
@Subcomponent
interface SiblingComponentTwo {
    @Subcomponent.Builder
    interface Builder {
        SiblingComponentTwo build();

    }
}
