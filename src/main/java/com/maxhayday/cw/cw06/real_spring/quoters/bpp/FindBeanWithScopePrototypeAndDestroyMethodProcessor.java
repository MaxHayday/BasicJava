package com.maxhayday.cw.cw06.real_spring.quoters.bpp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import javax.annotation.PreDestroy;
import java.util.Arrays;

public class FindBeanWithScopePrototypeAndDestroyMethodProcessor implements BeanFactoryPostProcessor {
    @SneakyThrows
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            Class<?> beanClass = Class.forName(beanClassName);
            boolean isPresentByPreDestroy = Arrays.stream(beanClass.getMethods()).anyMatch(method -> method.isAnnotationPresent(PreDestroy.class));
            if (beanDefinition.isPrototype() && (isPresentByPreDestroy || beanDefinition.getDestroyMethodName() != null)) {
                throw new IllegalStateException("You write scope prototype and destroy method in declaration of bean in .xml");
            }
        }


    }
}
