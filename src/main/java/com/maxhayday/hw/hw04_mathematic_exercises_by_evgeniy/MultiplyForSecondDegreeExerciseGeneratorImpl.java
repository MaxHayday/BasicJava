package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;

import com.maxhayday.hw.hw04_mathematic_exercises.Operation;

public class MultiplyForSecondDegreeExerciseGeneratorImpl implements ExerciseGenerator {
    private GeneratorAssistant assistant = new GeneratorAssistantImpl(2, 10);

    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setOperation(Operation.MULTIPLICATION);
        exercise.setAnswer(exercise.getA() * exercise.getB());
        return exercise;
    }
}
