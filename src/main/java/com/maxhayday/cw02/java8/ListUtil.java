package com.maxhayday.cw02.java8;

import java.util.List;

public class ListUtil {

    public static <T> int countDuplicate(T t, List<T> list, Equalator<T> equalator) {
        int count = 0;
        for (T t1 :
                list) {
            if (equalator.equals(t1, t)) {
                count++;
            }
        }
        return count;
    }
}
