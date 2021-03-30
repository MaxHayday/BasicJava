package com.maxhayday.hw.hw04_mathematic_exercises;

import com.maxhayday.cw.cw04.heroes.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Examinator {

    private List<MathExample> examples = List.of(
            new AdditionExampleImpl(),
            new SubtractionImpl(),
            new MultiplicationImpl());

    public List<Exercise> getExercises(int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> {
                    int j = RandomUtils.getRandomNumberUsingInts(0, examples.size());
                    if (examples.get(j).getClass() == AdditionExampleImpl.class)
                        return examples.get(j).mathExample(1, 100);
                    else if (examples.get(j).getClass() == SubtractionImpl.class)
                        return examples.get(j).mathExample(1, 10);
                    else return examples.get(j).mathExample(1, 10);
                }).collect(Collectors.toList());
    }
}
