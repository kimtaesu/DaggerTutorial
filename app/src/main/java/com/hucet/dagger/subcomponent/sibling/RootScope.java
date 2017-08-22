package com.hucet.dagger.subcomponent.sibling;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tyler on 2017. 8. 22..
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface RootScope {}
