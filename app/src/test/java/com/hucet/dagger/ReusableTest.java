package com.hucet.dagger;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by taesu on 2017-08-27.
 */

public class ReusableTest {

    @Test
    public void Instances_주소값이_같는지_테스트() {
        ComponentReusable componentReusable = DaggerReusableComponent
                .create()
                .componentReusable();

        Assert.assertThat(componentReusable.getObjectA(), Is.is(componentReusable.getObjectB()));
    }
}
