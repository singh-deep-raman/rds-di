package com.raman.rdsdi.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycleDemo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    // 1.
    public BeanLifeCycleDemo() {
        System.out.println("## I am inside BeanLifeCycleDemo constructor");
    }

    // 2.
    @Override
    public void setBeanName(String s) {
        System.out.println("## Setting Bean Name");
    }

    // 3.
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Setting BeanFactory");
    }

    // 4.
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Setting Application Context");
    }

    // 5.
    @PostConstruct
    public void postConstruct() {
        System.out.println("## PostConstruct");
    }

    // 6.
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## After Properties Set");
    }

    // 7.
    @PreDestroy
    public void preDestroy() {
        System.out.println("## PreDestroy");
    }

    // 8.
    @Override
    public void destroy() throws Exception {
        System.out.println("## Destroying Bean");
    }

    // after 4
    public void beforeInit() {
        System.out.println("## beforeInit added for BeanPostProcessor");
    }

    // after 6
    public void afterInit() {
        System.out.println("## afterInit added for BeanPostProcessor");
    }
}
