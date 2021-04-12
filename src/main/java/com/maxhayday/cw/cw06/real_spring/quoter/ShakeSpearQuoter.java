package com.maxhayday.cw.cw06.real_spring.quoter;

import lombok.Data;

@Data
public class ShakeSpearQuoter implements Quoter {
    private String message;
    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
