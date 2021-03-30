package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.Setter;

public class King extends Hero {
    @Setter
    private Weapon weapon = new Sword();

    @Override
    protected int getInitialHp() {
        return RandomUtils.getRandomNumberUsingInts(5, 15);
    }

    @Override
    protected int getInitialPower() {
        return RandomUtils.getRandomNumberUsingInts(5, 15);
    }

    @Override
    public void kick(Hero enemy) {
        weapon.kick(this, enemy);
    }
}
