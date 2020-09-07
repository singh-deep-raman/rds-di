package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;

/**
 * This class demonstrates how Property Injector DI works, refer to it's test
 */
public class PropertyInjectorController {

    /** As we will need to inject object in this, we can't declare it as private, violates OOPs also*/
    GreetingService greetingService;

    public String greetMessage() {
        return greetingService.greetMessage();
    }
}
