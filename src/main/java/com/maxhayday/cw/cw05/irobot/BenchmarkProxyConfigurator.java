package com.maxhayday.cw.cw05.irobot;

import lombok.SneakyThrows;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    private BenchmarkToggle benchmarkToggle = new BenchmarkToggle();

    @Override
    public Object wrapWithProxy(Object t, Class type) {

        if (type.isAnnotationPresent(Benchmark.class) ||
                Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, (org.springframework.cglib.proxy.InvocationHandler) (o, method, args) -> getInvocationHandlerLogic(t, type, method, args));
            }
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> getInvocationHandlerLogic(t, type, method, args));
        }
        return t;
    }

    private Object getInvocationHandlerLogic(Object t, Class type, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (benchmarkToggle.isEnabled() && (type.isAnnotationPresent(Benchmark.class) || classMethod.isAnnotationPresent(Benchmark.class))) {
            System.out.println("******** BENCHMARK started for method " + method.getName() + " ********");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("******** BENCHMARK ended for method " + method.getName() + " ********");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }

    @SneakyThrows
    private <T> Object invocationHandlerMethod(Method method, Object[] args, T t, Class type) throws IllegalAccessException, InvocationTargetException {
        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (classMethod.isAnnotationPresent(Benchmark.class) || type.isAnnotationPresent(Benchmark.class)) {
            System.out.println("******** BENCHMARK started for method " + method.getName() + " ********");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("******** BENCHMARK ended for method " + method.getName() + " ********");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
