package com.hucet.dagger;

import javax.inject.Inject;

import dagger.Component;
import dagger.Reusable;

/**
 * Created by taesu on 2017-08-27.
 */

@Component()
interface ReusableComponent {
    ComponentReusable componentReusable();
}

class ComponentReusable {

    @Inject
    ReusableObject objectA;
    @Inject
    ReusableObject objectB;

    @Inject
    ComponentReusable() {

    }

    public ReusableObject getObjectA() {
        return objectA;
    }

    public ReusableObject getObjectB() {
        return objectB;
    }
}

@Reusable
class ReusableObject {

    @Inject
    ReusableObject() {

    }
}
