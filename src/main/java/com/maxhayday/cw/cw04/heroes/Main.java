package com.maxhayday.cw.cw04.heroes;


public class Main {
    public static void main(String[] args) {
        GameManager manager = new GameManagerImpl();
        CharacterFactory factory = new CharacterFactory();
        manager.fight(factory.createCharacter(), factory.createCharacter());
    }
}
