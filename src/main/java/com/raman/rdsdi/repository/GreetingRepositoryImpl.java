package com.raman.rdsdi.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - English Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Spanish Greeting Service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello - German Greeting Service";
    }
}
