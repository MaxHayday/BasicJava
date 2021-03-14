package com.maxhayday.cw02.java8.for_each_with_delay;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;

public class LambdaUtils {

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer c) {
        for (T t :
                list) {
            Thread.sleep(delay);
            c.accept(t);
        }
    }

}
