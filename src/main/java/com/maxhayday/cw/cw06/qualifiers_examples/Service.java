package com.maxhayday.cw.cw06.qualifiers_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;


@org.springframework.stereotype.Service
public class Service {
    @Qualifier("oracleDao")
    @Autowired
    private Dao impl1;
    @Qualifier("derbyDao")
    @Autowired
    private Dao impl2;

    @PostConstruct
    public void showNameOfDB() {
        impl1.crud();
        impl2.crud();
    }
}
