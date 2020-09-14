package com.raman.rdsdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi from Setter Greeting Service.";
    }
}
