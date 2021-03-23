package com.maxhayday.cw.cw04.heroes;

import java.util.Random;

public class Knight extends Character {
    private static int power = RandomUtils.getRandomNumberUsingInts(2, 12);
    private static int damageNumber = RandomUtils.getRandomNumberUsingInts(2, power);

    public Knight() {
        super(RandomUtils.getRandomNumberUsingInts(2, 12), RandomUtils.getRandomNumberUsingInts(2, 12));
    }

    @Override
    public void kick(Character c) {
        c.setHp(--damageNumber);
        System.out.println("Knight kick " + c.getClass().getSimpleName() + " damage is: " + damageNumber);
    }
}
