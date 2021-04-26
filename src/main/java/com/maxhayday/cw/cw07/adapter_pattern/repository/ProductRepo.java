package com.maxhayday.cw.cw07.adapter_pattern.repository;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import com.maxhayday.cw.cw07.adapter_pattern.Chair;
import com.maxhayday.cw.cw07.adapter_pattern.Costable;
import com.maxhayday.cw.cw07.adapter_pattern.Table;

import java.util.List;

public class ProductRepo {
    private List<Costable> cache = List.of(new Chair(),new Table());

    public Costable getProduct(){
        return cache.get(RandomUtils.getRandomNumberUsingInts(0, cache.size()));
    }
}
