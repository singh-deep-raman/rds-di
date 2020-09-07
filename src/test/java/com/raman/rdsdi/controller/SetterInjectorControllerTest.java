package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Here we will mimic what Spring Context does to achieve Setter based DI
 */
class SetterInjectorControllerTest {

    private SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingService(new PropertyGreetingServiceImpl()); // this is the key line
    }

    @Test
    void greetMessage() {
        System.out.println(controller.greetMessage());
    }
}