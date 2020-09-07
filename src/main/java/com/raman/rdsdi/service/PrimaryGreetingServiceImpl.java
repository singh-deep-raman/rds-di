package com.raman.rdsdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // that makes this implementation the default implementation used for DI when Spring is in doubt
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String greetMessage() {
        return "Hi from PrimaryBean Greeting Service.";
    }
}
