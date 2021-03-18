package com.maxhayday.cw03.streams;

import com.maxhayday.cw03.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtils {
    public static Map<Seniority, List<Employee>> groupSeniorityBySalary(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(employee -> Seniority.findBySalary(employee.getSalary())));
    }
    public static Map<String,Integer> groupNameBySalary(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getName,Collectors.summingInt(Employee::getSalary)));
    }
}
