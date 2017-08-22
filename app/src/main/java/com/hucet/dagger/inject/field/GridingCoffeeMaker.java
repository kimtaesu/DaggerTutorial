package com.hucet.dagger.inject.field;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class GridingCoffeeMaker {
    @Inject
    Lazy<Grinder> lazyGrinder;

    @Inject
    public GridingCoffeeMaker() {

    }

    public void brew() {
        // Grinder는 .get()이 호출될 때 한 번 생성되고 캐쉬된다.
        lazyGrinder.get().grind();
    }

}