package com.maxhayday.hw.hw02;

import com.maxhayday.cw.cw03.Employee;

import java.util.List;


public class GroupEmployeesBySalary {

    public static Integer groupEmployeesBySalary(List<Employee> list) {
        return list.stream()
                .mapToInt(Employee::getSalary).sum();
    }
}
