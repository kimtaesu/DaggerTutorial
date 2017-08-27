package com.hucet.dagger;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by taesu on 2017-08-27.
 */

public class BindingInstanceTest {
    @Test
    public void BindingInstance() {
        App app = DaggerAppComponent
                .builder()
                .userName("Tyler")
                .build()
                .app();

        Assert.assertThat(app.getUserName(), Is.is("Tyler"));
    }
}
