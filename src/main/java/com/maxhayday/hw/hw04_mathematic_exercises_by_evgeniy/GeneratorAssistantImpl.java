package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GeneratorAssistantImpl implements GeneratorAssistant {
    private int min;
    private int max;

    @Override
    public Exercise generateTemplate() {
        return Exercise.builder()
                .a(RandomUtils.getRandomNumberUsingInts(min, max))
                .b(RandomUtils.getRandomNumberUsingInts(min, max))
                .build();
    }
}
