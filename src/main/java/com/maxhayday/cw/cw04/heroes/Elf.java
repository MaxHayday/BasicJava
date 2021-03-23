package com.maxhayday.cw.cw04.heroes;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (getPower() > c.getPower()) {
            c.setHp(0);
        } else
            c.setPower(c.getPower() - 1);
            System.out.println("Elf kick " + c.getClass().getSimpleName() + " damage is: " + c.getPower());

    }

}
