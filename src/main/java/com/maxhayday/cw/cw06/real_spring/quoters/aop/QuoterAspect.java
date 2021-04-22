package com.maxhayday.cw.cw06.real_spring.quoters.aop;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QuoterAspect {
    @Pointcut("execution(* com.maxhayday.cw.cw06.real_spring.quoters.business.*.say*(..))")
    public void allSayMethods() {
    }

    @SneakyThrows
    @Around("@annotation(com.maxhayday.cw.cw06.real_spring.quoters.business.Secured)")
    public Object doSecured(ProceedingJoinPoint pjp) {
        int i = RandomUtils.getRandomNumberUsingInts(0, 10);
        if (i < 5) {
            return pjp.proceed();
        } else {
            throw new SecurityException("no allowed here, try again later");
        }
    }

    @Before("allSayMethods()")
    public void handleSayMethods(JoinPoint jp) {
        String name = jp.getTarget().getClass().getSimpleName();
        System.out.println("And now quote: " + name);
    }
}
