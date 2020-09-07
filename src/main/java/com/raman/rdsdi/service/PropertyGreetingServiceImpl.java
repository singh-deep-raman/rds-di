package com.raman.rdsdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String greetMessage() {
        return "Hi from Property Greeting Service.";
    }
}
