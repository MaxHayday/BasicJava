package com.maxhayday.cw.cw03.design_patterns_by_evgeniy;

import java.util.Random;

public class DBUtils {
    private static Random random = new Random();

    public static int getMailCode() {
        return random.nextInt(3) + 1;
    }
}
