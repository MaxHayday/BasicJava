package com.maxhayday.hw.hw01_enums;


public class Main {
    public static void main(String[] args) {
        HttpCodesEnum.findByHttpCode(500).getHandler().getHttpCode();
    }
}
