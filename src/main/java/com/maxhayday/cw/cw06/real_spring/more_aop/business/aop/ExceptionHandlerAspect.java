package com.maxhayday.cw.cw06.real_spring.more_aop.business.aop;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import com.maxhayday.cw.cw06.real_spring.more_aop.business.DBException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.*;


@Aspect
public class ExceptionHandlerAspect {
    @Value("${dba}")
    private String[] mails;

    private Map<DBException, Void> exceptions = new WeakHashMap<>();

    @Pointcut("execution(* com.maxhayday.cw.cw06.real_spring.more_aop.business..*.*(..))")
    public void allBusinessMethods() {
    }

    @AfterThrowing(pointcut = "allBusinessMethods()", throwing = "e")
    public void handleDBException(DBException e) {
        if (!exceptions.containsKey(e)) {
            exceptions.put(e, null);
            for (String mail : mails) {
                System.out.println("mail sent to " + mail);
                System.out.println(e.getMessage());
            }
        }
    }
}
