package com.maxhayday.cw.cw04.heroes;


public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit is crying");
    }
}
