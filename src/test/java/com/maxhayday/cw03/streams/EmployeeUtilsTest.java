package com.maxhayday.cw03.streams;

import com.maxhayday.cw03.Employee;
import lombok.Builder;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class EmployeeUtilsTest {

    @Test
    public void groupSeniorityBySalary() {
        List<Employee> employees = List.of(
                Employee.builder().name("Max").salary(10000).build(),
                Employee.builder().name("Oleg").salary(20000).build(),
                Employee.builder().name("Ola").salary(15000).build(),
                Employee.builder().name("Oleg").salary(20000).build()
        );
        Map<String, Integer> map = EmployeeUtils.groupNameBySalary(employees);
        System.out.println(map);
    }


}