package com.hucet.dagger.inject.field;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class BigCoffeeMaker {
    @Inject
    Provider<PP> ppProvider;

    @Inject
    public BigCoffeeMaker() {

    }

    public void brew() {
        Log.e("!!!!!!!!", ppProvider.get().getPpTitle()); //new filter every time.
    }

}
