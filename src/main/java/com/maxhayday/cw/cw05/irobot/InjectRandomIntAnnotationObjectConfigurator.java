package com.maxhayday.cw.cw05.irobot;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type, field -> field.isAnnotationPresent(InjectRandomInt.class));
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            int min = annotation.min();
            int max = annotation.max();
            int value = RandomUtils.getRandomNumberUsingInts(min, max);
            field.setAccessible(true);
            field.set(t, value);
        }
    }
}
