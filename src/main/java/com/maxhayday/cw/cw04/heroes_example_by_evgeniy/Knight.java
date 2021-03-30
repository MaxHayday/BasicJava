package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.Setter;

public class Knight extends Hero {
    @Setter
    private Weapon weapon = new Sword();

    @Override
    protected int getInitialHp() {
        return RandomUtils.getRandomNumberUsingInts(2, 12);
    }

    @Override
    protected int getInitialPower() {
        return RandomUtils.getRandomNumberUsingInts(2, 12);
    }

    @Override
    public void kick(Hero enemy) {
        weapon.kick(this, enemy);
    }
}
