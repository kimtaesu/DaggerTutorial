package com.hucet.dagger;

import com.hucet.dagger.subcomponent.encapsulation.ApplicationComponentFirst;
import com.hucet.dagger.subcomponent.encapsulation.ApplicationComponentSecond;
import com.hucet.dagger.subcomponent.encapsulation.DaggerApplicationComponentFirst;
import com.hucet.dagger.subcomponent.encapsulation.DaggerApplicationComponentSecond;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by tyler on 2017. 8. 28..
 */

public class ApplicationComponentTest {
    @Test
    public void Shoude_be_Not_nullS_ubcomponent_Database() {
        ApplicationComponentFirst first = DaggerApplicationComponentFirst.create();
        first.aa();
        ApplicationComponentSecond second = DaggerApplicationComponentSecond.create();
        second.bb();
//        Assert.assertTrue(DaggerApplicationComponentFirst.create().database() != null);
    }
}
