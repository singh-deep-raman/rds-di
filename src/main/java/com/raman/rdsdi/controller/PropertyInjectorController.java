package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // tells that it is a Spring Managed Component
public class PropertyInjectorController {

    @Autowired // it tells that this is Property Based Injection
    GreetingService greetingService;

    public String greetMessage() {
        return greetingService.greetMessage();
    }
}
