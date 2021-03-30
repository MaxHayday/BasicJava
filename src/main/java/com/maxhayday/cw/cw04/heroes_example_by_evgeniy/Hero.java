package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

import lombok.Data;

@Data
public abstract class Hero {

    private int power, hp;

    public Hero() {
        hp = getInitialHp();
        power = getInitialPower();
    }

    protected abstract int getInitialHp();

    protected abstract int getInitialPower();

    public abstract void kick(Hero enemy);

    public boolean isAlive() {
        return hp > 0;
    }

    protected void die() {
        hp = 0;
    }

    protected void decreasePower(int delta) {
        power -= delta;
    }

    public void decreaseHp(int damage) {
        hp -= damage;
    }
}

