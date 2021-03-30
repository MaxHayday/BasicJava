package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();
        gameManager.fight(heroFactory.getRandomHero(), heroFactory.getRandomHero());
    }
}
