package com.maxhayday.hw.hw04_mathematic_exercises;

import static com.maxhayday.cw.cw04.heroes.RandomUtils.getRandomNumberUsingInts;

public class SubtractionImpl implements MathExample {

    @Override
    public Exercise mathExample(double min, double max) {
        int addition1 = getRandomNumberUsingInts((int) max / 2, (int) max);
        int addition2 = getRandomNumberUsingInts((int) min, (int) max / 2);

        return Exercise.builder()
                .a(addition1)
                .b(addition2)
                .operation(Operation.SUBTRACTION)
                .answer(addition1 - addition2)
                .build();
    }
}
