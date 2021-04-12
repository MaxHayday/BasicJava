package com.maxhayday.cw.cw04.heroes;

import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();

    public static int getRandomNumberUsingInts(int min, int max) {
        return random.ints(min, max)
                .findAny()
                .getAsInt();
    }
}
