package com.raman.rdsdi.service;

import com.raman.rdsdi.repository.GreetingRepository;

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en" :
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
