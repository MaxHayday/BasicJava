package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import com.maxhayday.hw.hw04_mathematic_exercises.Operation;

public class MinusForKinderGardenDegreeExerciseGeneratorImpl implements ExerciseGenerator {

    @Override
    public Exercise generate() {
        int a = RandomUtils.getRandomNumberUsingInts(1, 100);
        int b = RandomUtils.getRandomNumberUsingInts(1, a);
        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(Operation.SUBTRACTION)
                .answer(a - b)
                .build();
    }
}
