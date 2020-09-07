package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // tells it is Spring Managed Controller
public class SetterInjectorController {

    private GreetingService greetingService;

    @Autowired // denotes Setter based DI with Spring Application Context
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetMessage() {
        return greetingService.greetMessage();
    }
}
