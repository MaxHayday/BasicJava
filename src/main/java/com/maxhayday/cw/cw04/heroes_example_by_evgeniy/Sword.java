package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;

public class Sword implements Weapon {
    @Override
    public void kick(Hero attacker, Hero defender) {
        int damage = RandomUtils.getRandomNumberUsingInts(0, attacker.getPower());
        defender.decreaseHp(damage);
        System.out.println(attacker.getClass().getSimpleName() + " kicked " + defender.getClass().getSimpleName() + " damage = " + damage);
    }
}
