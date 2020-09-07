package com.raman.rdsdi.service;

/**
 * This Service will be injected into Controllers using different DI techniques like
 *      1. Property based injection
 *      2. Setter injection
 *      3. Constructor injection
 *
 */
public interface GreetingService {
    String greetMessage();
}
