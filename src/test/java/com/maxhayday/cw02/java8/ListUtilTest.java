package com.maxhayday.cw02.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ListUtilTest {

    @Test
    public void countDuplicate() {
        List<String> stringList = asList("java", "Java", "JaVa", "Scala");
        int amount = ListUtil.countDuplicate("java", stringList, (s, t1) -> s.equalsIgnoreCase(t1));
        Assert.assertEquals(3, amount);
    }
}