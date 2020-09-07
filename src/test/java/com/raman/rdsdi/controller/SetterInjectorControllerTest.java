package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Here we will mimic what Spring Context does to achieve Setter based DI
 */
class SetterInjectorControllerTest {

    private SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingService(new GreetingServiceImpl()); // this is the key line
    }

    @Test
    void greetMessage() {
        System.out.println(controller.greetMessage());
    }
}