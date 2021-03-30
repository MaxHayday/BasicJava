package com.maxhayday.hw.hw04_mathematic_exercises;

import static com.maxhayday.cw.cw04.heroes.RandomUtils.getRandomNumberUsingInts;

public class DivisionImpl implements MathExample {

    @Override
    public Exercise mathExample(double min, double max) {
      int  addition1 = getRandomNumberUsingInts((int) min, (int) max / 2);
      int  addition2 = getRandomNumberUsingInts((int) max / 2, (int) max);
      int  addition3 = addition1 * addition2;
        return Exercise.builder()
                .a(addition3)
                .b(addition2)
                .answer(addition1)
                .operation(Operation.DIVISION)
                .build();
    }
}