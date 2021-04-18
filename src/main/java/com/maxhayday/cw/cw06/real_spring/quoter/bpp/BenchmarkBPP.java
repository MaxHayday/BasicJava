package com.maxhayday.cw.cw06.real_spring.quoter.bpp;

import com.maxhayday.cw.cw05.irobot.Benchmark;
import com.maxhayday.cw.cw05.irobot.BenchmarkProxyConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BenchmarkBPP implements BeanPostProcessor {
    private Map<String, Class> map = new HashMap<>();
    private BenchmarkProxyConfigurator benchmarkProxyConfigurator = new BenchmarkProxyConfigurator();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Benchmark.class)) {
            map.put(beanName, bean.getClass());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = map.get(beanName);
        if (type != null) {
            Object proxy = benchmarkProxyConfigurator.wrapWithProxy(bean, type);
            return proxy;
        }
        return bean;
    }
}
