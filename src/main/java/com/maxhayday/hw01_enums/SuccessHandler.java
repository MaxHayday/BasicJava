package com.maxhayday.hw01_enums;

public class SuccessHandler implements Handler {
    @Override
    public void getHttpCode() {
        System.out.println("Success Handler");
    }
}
