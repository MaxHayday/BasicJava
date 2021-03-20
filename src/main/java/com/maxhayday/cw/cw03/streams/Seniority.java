package com.maxhayday.cw.cw03.streams;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(0, 9999),
    MIDDLE(10000, 19999),
    SENIOR(20000, 29000);

    private final int min;
    private final int max;

    public static Seniority findBySalary(int salary) {
        return Arrays.stream(values()).filter(seniority -> seniority.min <= salary && seniority.max >= salary)
                .findAny()
                .orElseThrow(() -> new IllegalStateException("Does` t support"));
    }
}
