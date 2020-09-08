package com.raman.rdsdi.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor interfaces 2 methods are default methods
 * It is rarely used but you might have some edge use case
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLifeCycleDemo) {
            ((BeanLifeCycleDemo)bean).beforeInit(); // a method added in our class to call from here
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLifeCycleDemo) {
            ((BeanLifeCycleDemo)bean).afterInit(); // a method added in our class to call from here
        }
        return bean;
    }
}
