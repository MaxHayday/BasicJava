package com.maxhayday.hw01_enums;


public class ClientErrorHandler implements Handler {
    @Override
    public void getHttpCode() {
        System.out.println("Client Error");
    }
}
