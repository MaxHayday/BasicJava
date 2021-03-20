package com.maxhayday.hw.hw03.friday13;

import org.junit.Assert;
import org.junit.Test;


public class FridayCalculatorTest {

    @Test
    public void getCountOfAllFridaysOfYears() {
        int count = FridayCalculator.getCountOfAllFridaysOfYears(2018,2020);
        Assert.assertEquals(4,count);
    }
}