package com.hucet.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by taesu on 2017-08-27.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface UserName {
}