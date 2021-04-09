package com.maxhayday.cw.cw03.design_patterns_by_evgeniy.command_and_strategy;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface TemplateCode {
    int value();
}
