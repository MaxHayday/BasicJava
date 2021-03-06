package com.maxhayday.cw.cw06.real_spring.qualifiers_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableScheduling
public class Config {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
