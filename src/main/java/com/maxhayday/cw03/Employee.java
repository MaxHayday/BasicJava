package com.maxhayday.cw03;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Employee {
    private String name;
    private Integer salary;
}
