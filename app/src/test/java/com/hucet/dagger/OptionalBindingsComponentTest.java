package com.hucet.dagger;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * Created by taesu on 2017-08-27.
 */
public class OptionalBindingsComponentTest {
    @Test
    public void OptionalBindings_테스트() {
        OptionalBindingsComponent component = DaggerOptionalBindingsComponent.builder().build();
        Assert.assertThat(component.coffeCozy().isPresent(), Is.is(false));
    }
}