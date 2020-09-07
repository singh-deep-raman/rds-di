package com.raman.rdsdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES") // Profile ES, Spring will consider this class when active profile is ES in application.properties file
@Service("i18nService") // bean name, it will be same in another implementation too, only then we can use @Profile
public class I18NSpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String greetMessage() {
        return "Hi - In Spanish";
    }
}
