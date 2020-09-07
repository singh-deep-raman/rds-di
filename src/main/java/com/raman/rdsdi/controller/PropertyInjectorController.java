package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // tells that it is a Spring Managed Component
public class PropertyInjectorController {

    @Qualifier("propertyGreetingServiceImpl") // bean name of implementation class we want to inject
    @Autowired // it tells that this is Property Based Injection
    GreetingService greetingService;

    public String greetMessage() {
        return greetingService.greetMessage();
    }
}
