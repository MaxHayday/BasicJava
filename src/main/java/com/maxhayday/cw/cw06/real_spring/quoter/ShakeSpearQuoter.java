package com.maxhayday.cw.cw06.real_spring.quoter;

import com.maxhayday.cw.cw05.irobot.InjectRandomInt;
import lombok.Data;

import java.util.stream.IntStream;

@Data
public class ShakeSpearQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 7)
    private int repeat;
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
