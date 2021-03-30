package com.maxhayday.cw.cw04.heroes_example_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class HeroFactory {
    List<Class<? extends Hero>> heroClasses;

    public HeroFactory() {
        Reflections scanner = new Reflections("com.maxhayday.cw.cw04.heroes_example_by_evgeniy");
        Set<Class<? extends Hero>> classes = scanner.getSubTypesOf(Hero.class);
        heroClasses = classes.stream()
                .filter(aClass -> !Modifier.isAbstract(aClass.getModifiers()))
                .collect(toList());
    }
    @SneakyThrows
    public Hero getRandomHero(){
        int i = RandomUtils.getRandomNumberUsingInts(0,heroClasses.size());
        return heroClasses.get(i).getDeclaredConstructor().newInstance();
    }
}
