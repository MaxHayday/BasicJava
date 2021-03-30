package com.maxhayday.hw.hw04_mathematic_exercises;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Operation {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION(":");

    private final String operator;

}
