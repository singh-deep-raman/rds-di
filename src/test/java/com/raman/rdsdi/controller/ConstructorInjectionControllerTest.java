package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Here we will mimic, what Spring Application Context does to achieve Constructor based DI
 */
class ConstructorInjectionControllerTest {

    private ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new PropertyGreetingServiceImpl());
    }

    @Test
    void greetMessage() {
        System.out.println(controller.greetMessage());
    }
}