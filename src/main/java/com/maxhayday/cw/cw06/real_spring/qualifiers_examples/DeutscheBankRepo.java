package com.maxhayday.cw.cw06.real_spring.qualifiers_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Repository
@Autowired
public @interface DeutscheBankRepo {
    DBType value();
}
