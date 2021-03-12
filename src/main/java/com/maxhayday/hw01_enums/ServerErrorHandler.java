package com.maxhayday.hw01_enums;


public class ServerErrorHandler implements Handler {
    @Override
    public void getHttpCode() {
        System.out.println("Server Error");
    }
}
