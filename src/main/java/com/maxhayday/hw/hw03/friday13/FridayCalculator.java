package com.maxhayday.hw.hw03.friday13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FridayCalculator {

    public static int getCountOfAllFridaysOfYears(int start, int end) {
        LocalDate fromDate = LocalDate.of(start, 1, 1);
        LocalDate toDate = LocalDate.of(end, 1, 1);
        return (int) fromDate.datesUntil(toDate)
                .filter(f -> f.getDayOfWeek() == DayOfWeek.FRIDAY && f.getDayOfMonth() == 13)
                .count();
    }

    //example by Evgeniy
    public static void printFriday13(int start, int end) {
        LocalDate startDate = LocalDate.of(start, 1, 13);
        LocalDate endDate = LocalDate.of(end, 1, 14);
        Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate, endDate))
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(groupingBy(LocalDate::getYear, counting()))
                .entrySet().stream()
                .sorted((t, t1) -> (int) (t1.getValue() - t.getValue()))
                .forEach(System.out::println);
    }
}
