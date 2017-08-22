package com.hucet.dagger.inject.field;

import javax.inject.Inject;

/**
 * Created by tyler on 2017. 8. 22..
 */

public class PP {

    private String ppTitle;

    @Inject
    public PP() {
        ppTitle = "ppTitle";
    }

    public String getPpTitle() {
        return ppTitle;
    }
}
