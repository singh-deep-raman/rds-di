package com.raman.rdsdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greetMessage() {
        return "Hey !! How are you?";
    }
}
