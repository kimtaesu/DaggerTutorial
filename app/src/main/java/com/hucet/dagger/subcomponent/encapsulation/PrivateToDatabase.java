package com.hucet.dagger.subcomponent.encapsulation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tyler on 2017. 8. 22..
 */

@PrivateToDatabase
@Documented
@Retention(RUNTIME)
public @interface PrivateToDatabase {}
