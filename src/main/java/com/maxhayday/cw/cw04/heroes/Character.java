package com.maxhayday.cw.cw04.heroes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Character {

    private int power, hp;

    public Character() {
        power = 0;
        hp = 0;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }
}

