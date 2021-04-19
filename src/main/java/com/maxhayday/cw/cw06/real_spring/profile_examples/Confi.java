package com.maxhayday.cw.cw06.real_spring.profile_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableScheduling
public class Confi {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");
        new AnnotationConfigApplicationContext(Confi.class);
    }
}
