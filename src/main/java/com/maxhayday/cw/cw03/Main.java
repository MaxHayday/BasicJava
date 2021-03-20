package com.maxhayday.cw.cw03;

import com.maxhayday.hw.hw02.GroupEmployeesBySalary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("Max",10), new Employee("ola",20),
                new Employee("Dima",30), new Employee("dima",30), new Employee("Myroslav",35), new Employee("myroslav",35));
//        var list2 = list.stream().filter(s->!  s.getName().matches("[A-Z]")).collect(Collectors.toList());
//        list2.forEach(System.out::println);
//        list2.stream().map(s->s.getName().toUpperCase()).forEach(System.out::println);


        List<Integer> nums = new ArrayList<>();
        IntStream.range(1, 10000).parallel().forEach(nums::add);
        System.out.println(nums.size());

        System.out.println(GroupEmployeesBySalary.groupEmployeesBySalary(list));


    }
}
