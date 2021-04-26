package com.maxhayday.cw.cw07.adapter_pattern;

import java.util.List;

public class PriceCalculator {
    public double total(List<Priceable> pricreables) {
        return pricreables.stream().mapToDouble(Priceable::getPrice).sum();
    }

}


//    public double total(List<Manager> pricrables) {
//        return pricrables.stream().mapToDouble(Priceable::getPrice).sum();
//    }