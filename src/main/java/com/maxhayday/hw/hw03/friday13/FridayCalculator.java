package com.maxhayday.hw.hw03.friday13;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
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

    //My example most repeated word in text
    @SneakyThrows
    public static void determineMostRepeatedWordInText(String fileName){
        BufferedReader bufferedReader = new BufferedReader(new FileReader((fileName)));
        bufferedReader.lines().flatMap(Pattern.compile("\\W+")::splitAsStream)
                .filter(s -> s.length() >= 4)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(w->w, Collectors.summingInt(w->1)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

}
