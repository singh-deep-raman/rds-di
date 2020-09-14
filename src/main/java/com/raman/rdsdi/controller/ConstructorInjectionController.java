package com.raman.rdsdi.controller;

import com.raman.rdsdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    // no need of @Autowired annotation in case of Constructor Dependency Injection with Spring Application Context
    public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetMessage() {
        return greetingService.sayGreeting();
    }
}
