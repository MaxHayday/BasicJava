package com.maxhayday.hw.hw03;

import com.maxhayday.cw.cw03.Employee;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;


public class GroupEmployeesBySalary {

    public static Integer groupEmployeesBySalary(List<Employee> list) {
        return list.stream()
                .mapToInt(Employee::getSalary).sum();
    }

    @SneakyThrows
    public static long countingWordsFromFile(String fileName) {
        //File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader((fileName)));
        return bufferedReader.lines().flatMap(e -> Arrays.stream(e.split("\\W+"))).count();
    }

    public static void main(String[] args) {
        System.out.println(countingWordsFromFile("/home/max/IdeaProjects/BasicJava/TestFile"));

    }
}
