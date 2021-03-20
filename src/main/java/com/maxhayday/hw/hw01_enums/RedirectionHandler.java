package com.maxhayday.hw.hw01_enums;

public class RedirectionHandler implements Handler {
    @Override
    public void getHttpCode() {
        System.out.println("Redirection");
    }
}
