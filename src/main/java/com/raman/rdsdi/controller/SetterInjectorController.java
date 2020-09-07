package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;

/** This class will use Setter Injection DI technique to inject Services in Controller */
public class SetterInjectorController {

    /** Better than Property Injection because our field is private now, but still it is not final, so not tightly Encapsulated */
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetMessage() {
        return greetingService.greetMessage();
    }
}
