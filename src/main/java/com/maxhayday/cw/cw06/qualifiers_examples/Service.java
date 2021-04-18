package com.maxhayday.cw.cw06.qualifiers_examples;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;


@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private OracleDao impl1;
    @Autowired
    private DerbyDao impl2;

    @PostConstruct
    public void showNameOfDB() {
        impl1.crud();
        impl2.crud();
    }
}
