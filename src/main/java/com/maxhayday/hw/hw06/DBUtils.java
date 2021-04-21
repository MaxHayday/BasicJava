package com.maxhayday.hw.hw06;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class DBUtils {
    private static Random random = new Random();

    public static int getMailCode() {
        return random.nextInt(3) + 1;
    }
}
