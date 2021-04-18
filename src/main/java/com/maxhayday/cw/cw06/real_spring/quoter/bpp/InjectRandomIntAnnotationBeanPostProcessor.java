package com.maxhayday.cw.cw06.real_spring.quoter.bpp;

import com.maxhayday.cw.cw05.irobot.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    private InjectRandomIntAnnotationObjectConfigurator injectConfigurator = new InjectRandomIntAnnotationObjectConfigurator();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        injectConfigurator.configure(bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
