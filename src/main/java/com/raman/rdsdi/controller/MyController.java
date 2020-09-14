package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    // Constructor DI
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
