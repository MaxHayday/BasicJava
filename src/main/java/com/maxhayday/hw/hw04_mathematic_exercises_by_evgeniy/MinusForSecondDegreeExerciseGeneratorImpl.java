package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;

import com.maxhayday.hw.hw04_mathematic_exercises.Operation;

public class MinusForSecondDegreeExerciseGeneratorImpl implements ExerciseGenerator {
    private GeneratorAssistant assistant = new GeneratorAssistantImpl(0, 100);

    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setOperation(Operation.SUBTRACTION);
        exercise.setAnswer(exercise.getB() - exercise.getA());
        return exercise;
    }
}
