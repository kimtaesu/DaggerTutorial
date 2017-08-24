package com.hucet.dagger.subcomponent;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import dagger.releasablereferences.CanReleaseReferences;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tyler on 2017. 8. 24..
 */

@Documented
@Retention(RUNTIME)
@CanReleaseReferences
@Scope
public @interface MyScope {
}