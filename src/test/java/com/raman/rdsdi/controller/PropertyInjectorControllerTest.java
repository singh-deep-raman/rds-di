package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Here we will mimic, what Spring Application Context does to implement PropertyBased DI
 */
class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectorController();
        controller.greetingService = new PropertyGreetingServiceImpl(); // as you can see it is not OOP friendly
    }

    @Test
    void greetMessage() {
        System.out.println(controller.greetMessage());
    }
}