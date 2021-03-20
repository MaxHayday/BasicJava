package com.maxhayday.cw.cw03.home_made_junit;

import lombok.SneakyThrows;


import java.lang.reflect.Method;

public class TestRunner {

    @SneakyThrows
    public void runAllTestsForClassByName(String className){
        Class<?> type = Class.forName(className);
        runAllTestsForClass(type);
    }

    @SneakyThrows
    public void runAllTestsForClass(Class<?> type) {
        Object o = type.getDeclaredConstructor().newInstance();
        runAllTests(o);
    }

    @SneakyThrows
    public void runAllTests(Object o) {
        Method[] methods = o.getClass().getMethods();

        //if you want to fill in some field from class

       /* Field[] fields = o.getClass().getDeclaredFields();
        for (Field field :
                fields) {
            field.setAccessible(true);
            field.set(o, 12);
        }
        */
        for (Method method :
                methods) {
            if (method.getName().startsWith("test") || method.isAnnotationPresent(MyTest.class)) {
                method.invoke(o);
            }
        }
    }
}
