package com.hucet.dagger.subcomponent.sibling;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by tyler on 2017. 8. 22..
 */


@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RootScope {
}
