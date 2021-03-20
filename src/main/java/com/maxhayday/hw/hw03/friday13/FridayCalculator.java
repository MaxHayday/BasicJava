package com.maxhayday.hw.hw03.friday13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayCalculator {

    public static int getCountOfAllFridaysOfYears(int start, int end) {
        LocalDate fromDate = LocalDate.of(start, 1, 1);
        LocalDate toDate = LocalDate.of(end, 1, 1);
        return (int) fromDate.datesUntil(toDate)
                .filter(f -> f.getDayOfWeek() == DayOfWeek.FRIDAY && f.getDayOfMonth() == 13)
                .count();
    }
}
