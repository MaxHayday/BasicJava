package com.maxhayday.cw.cw06.real_spring.more_aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class DBException extends RuntimeException {

    public DBException(String message) {
        super(message);
    }


    public DBException(String message, Throwable cause) {
        super(message, cause);
    }
}
