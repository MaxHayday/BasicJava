package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator();
        List<Exercise> exercises = examinator.getExercises(10);
        exercises.forEach(System.out::println);
    }
}
