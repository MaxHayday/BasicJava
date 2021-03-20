package com.maxhayday.cw.cw03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        List<Employer> list = List.of(new Employer("Max"), new Employer("ola"),
//                new Employer("Dima"), new Employer("dima"), new Employer("Myroslav"), new Employer("myroslav"));
//        var list2 = list.stream().filter(s->!  s.getName().matches("[A-Z]")).collect(Collectors.toList());
//        list2.forEach(System.out::println);
//        list2.stream().map(s->s.getName().toUpperCase()).forEach(System.out::println);
        List<Integer> nums = new ArrayList<>();
        IntStream.range(1, 10000).parallel().forEach(nums::add);
        System.out.println(nums.size());


    }
}
