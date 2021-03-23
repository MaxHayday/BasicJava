package com.maxhayday.cw.cw04.heroes;

import java.util.Random;

public class King extends Character {
    private static int power = RandomUtils.getRandomNumberUsingInts(5, 15);
    private static int damageNumber = RandomUtils.getRandomNumberUsingInts(5, power);

    public King() {
        super(RandomUtils.getRandomNumberUsingInts(5, 15), RandomUtils.getRandomNumberUsingInts(5, 15));
    }

    @Override
    public void kick(Character c) {
        c.setHp(--damageNumber);
        System.out.println("King kick " + c.getClass().getSimpleName() + " damage is: " + damageNumber);
    }

}
