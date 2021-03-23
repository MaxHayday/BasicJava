package com.maxhayday.cw.cw04.heroes;

import lombok.SneakyThrows;

public class GameManagerImpl implements GameManager {
    @Override
    @SneakyThrows
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            Thread.sleep(500);
            c2.kick(c1);
        }
        if (c1.isAlive()) {
            getPrintln(c1);
        } else {
            getPrintln(c2);
        }
    }

    private void getPrintln(Character c1) {
        System.out.println(c1.getClass().getSimpleName() + " is winner!");
    }
}
