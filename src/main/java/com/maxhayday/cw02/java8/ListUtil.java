package com.maxhayday.cw02.java8;

import java.util.List;

public class ListUtil {

    public static <T> int countDuplicate(T t, List<T> list) {
        int count = 0;
        for (T t1 :
                list) {
            if (t.equals(t1.toString().toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}
