package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Here we will mimic, what Spring Application Context does to achieve Constructor based DI
 */
class ConstructorInjectionControllerTest {

    private ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    void greetMessage() {
        System.out.println(controller.greetMessage());
    }
}