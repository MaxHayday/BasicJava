package com.maxhayday.cw02.java8.for_each_with_delay;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        LambdaUtils.forEachWithDelay(asList(2, 4, 6, 8, 12), 250, s -> System.out.println(s));
    }
}
