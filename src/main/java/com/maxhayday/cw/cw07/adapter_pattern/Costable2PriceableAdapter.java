package com.maxhayday.cw.cw07.adapter_pattern;

public class Costable2PriceableAdapter implements Priceable {

    private Costable costable;

    public Costable2PriceableAdapter(Costable costable) {
        this.costable = costable;
    }

    @Override
    public double getPrice() {
        return costable.getCost();
    }
}
