package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

public class Elf extends Hero {
    @Override
    protected int getInitialHp() {
        return 10;
    }

    @Override
    protected int getInitialPower() {
        return 10;
    }

    @Override
    public void kick(Hero enemy) {
        if (getPower() > enemy.getPower()) {
            enemy.die();
        } else {
            enemy.decreasePower(1);
        }
    }
}
