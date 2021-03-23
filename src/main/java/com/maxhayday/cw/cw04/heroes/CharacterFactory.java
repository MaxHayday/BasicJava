package com.maxhayday.cw.cw04.heroes;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static java.util.stream.Collectors.toList;


public class CharacterFactory {
    private List<Class<? extends Character>> classes;
  //  private int random = new Random().nextInt(classes.size() - 1) + 1;

    public CharacterFactory() {
        Reflections scanner = new Reflections("com.maxhayday.cw.cw04.heroes");
        Set<Class<? extends Character>> subTypesOf = scanner.getSubTypesOf(Character.class);
        classes = subTypesOf.stream()
                .filter(aClass -> !Modifier.isAbstract(aClass.getModifiers()))
                .collect(toList());

    }


    @SneakyThrows
    public Character createCharacter() {
        int random = RandomUtils.getRandomNumberUsingInts(1,classes.size());
        return classes.get(random).getDeclaredConstructor().newInstance();
    }
}
