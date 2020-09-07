package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;

/**
 * This class will use Constructor Injection DI technique to inject Services in this class
 */
public class ConstructorInjectionController {

    /** better than Setter injection because field is final, and no one can change using setter again */
    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetMessage() {
        return greetingService.greetMessage();
    }
}
