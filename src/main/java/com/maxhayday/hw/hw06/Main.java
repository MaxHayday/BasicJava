package com.maxhayday.hw.hw06;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
