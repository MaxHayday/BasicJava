package com.maxhayday.hw.hw04_mathematic_exercises;

import static com.maxhayday.cw.cw04.heroes.RandomUtils.getRandomNumberUsingInts;

public class MultiplicationImpl implements MathExample {

    @Override
    public Exercise mathExample(double min, double max) {
        int addition1 = getRandomNumberUsingInts((int) min, (int) max);
        int addition2 = getRandomNumberUsingInts((int) min, (int) max);

        return Exercise.builder()
                .a(addition1)
                .b(addition2)
                .operation(Operation.MULTIPLICATION)
                .answer(addition1 * addition2)
                .build();
    }
}
