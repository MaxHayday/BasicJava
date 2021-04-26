package com.maxhayday.cw.cw07.adapter_pattern;

import com.maxhayday.cw.cw07.adapter_pattern.repository.ProductRepo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        List<Priceable> costables = Stream.generate(productRepo::getProduct)
                .limit(20)
                .map(Costable2PriceableAdapter::new)
                .collect(Collectors.toList());
        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println(priceCalculator.total(costables));
    }
}
