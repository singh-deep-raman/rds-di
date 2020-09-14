package com.raman.rdsdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi from Constructor Greeting Service.";
    }
}
