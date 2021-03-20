package com.maxhayday.cw.cw02.java8.method_references;


import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class AnimalFactory {
    private List<Supplier<Animal>> animals = asList(Dog::new, Cat::new);


    public Animal createRandomAnimal() {
        return animals.get(new Random().nextInt(animals.size())).get();
    }
}
