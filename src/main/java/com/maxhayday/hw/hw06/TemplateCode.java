package com.maxhayday.hw.hw06;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface TemplateCode {
    int value();
}
