package com.raman.rdsdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN") // if 2 @Profile found with "default" Spring Container won't start
@Service("i18nService") // bean name, it will be same in another implementation too, only then we can use @Profile
public class I18NEnglishGreetingServiceImpl implements GreetingService{
    @Override
    public String greetMessage() {
        return "Hi in English";
    }
}
