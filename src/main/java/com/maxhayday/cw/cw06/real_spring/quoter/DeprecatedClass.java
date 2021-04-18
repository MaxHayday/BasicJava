package com.maxhayday.cw.cw06.real_spring.quoter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
    Class<?> newClass();
}
