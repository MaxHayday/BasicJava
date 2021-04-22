package com.maxhayday.cw.cw06.real_spring.quoters.business;

import com.maxhayday.cw.cw05.irobot.InjectRandomInt;
import com.maxhayday.cw.cw06.real_spring.quoters.Book;
import org.springframework.beans.factory.annotation.Value;


@Book
public class ShakeSpearQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 7)
    private int repeat;
    @Value("${shake}")
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
