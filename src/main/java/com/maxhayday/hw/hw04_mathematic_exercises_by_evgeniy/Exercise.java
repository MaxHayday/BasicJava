package com.maxhayday.hw.hw04_mathematic_exercises_by_evgeniy;

import com.maxhayday.hw.hw04_mathematic_exercises.Operation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private double a;
    private double b;
    private double answer;
    private Operation operation;

    @Override
    public String toString() {
        return a + " " + operation.getOperator() + " " + b + " = " + answer;
    }
}
