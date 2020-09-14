package com.raman.rdsdi.config;

import com.raman.rdsdi.repository.GreetingRepository;
import com.raman.rdsdi.service.GreetingService;
import com.raman.rdsdi.service.GreetingServiceFactory;
import com.raman.rdsdi.service.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    /**
     *  When this configuration file is read by Spring, it will try to create bean for GreetingService Factory
     *  But this method needs GreetingRepository object too, so first spring will resolve this dependency
     *  In our case we have only one implementation class for GreetingRepository, so it will be injected and our
     *      GreetingServiceFactory bean is ready to use
     *
     * */
    @Bean
    public GreetingServiceFactory getGreetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    /** Now we will create beans for each GreetingService implementation using GreetingServiceFactory
     *  R--> The return type of these methods will not be implementation class, but the interface */

    @Bean
    @Primary
    @Profile({"default","en"}) // if we want to use profiles like we did earlier, English is default one
    public GreetingService getPrimaryGreetingService (GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingService getGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService getSpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }
}
