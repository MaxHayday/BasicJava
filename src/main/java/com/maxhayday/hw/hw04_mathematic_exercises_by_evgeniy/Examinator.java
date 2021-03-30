package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;

import com.maxhayday.cw.cw04.heroes.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Examinator {

    private List<ExerciseGenerator> exerciseGenerators = List.of(
            new PlusForSecondDegreeExerciseGeneratorImpl(),
            new MinusForKinderGardenDegreeExerciseGeneratorImpl(),
            new MultiplyForSecondDegreeExerciseGeneratorImpl());

    public List<Exercise> getExercises(int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> {
                    int j = RandomUtils.getRandomNumberUsingInts(0, exerciseGenerators.size());
                    return exerciseGenerators.get(j).generate();
                }).collect(Collectors.toList());
    }

}
