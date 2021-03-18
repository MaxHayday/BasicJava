package com.maxhayday.cw03.design_patterns;

public class DontCallUsImp implements CodesHandler {
    @Override
    public void getCode() {
        System.out.println("Don`t call us we call you.");
    }
}
