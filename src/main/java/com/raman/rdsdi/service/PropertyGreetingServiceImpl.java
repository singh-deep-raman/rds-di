package com.raman.rdsdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi from Property Greeting Service.";
    }
}
