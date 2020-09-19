package com.raman.rdsdi.config;

import com.raman.rdsdi.examplebeans.FakeDataSource;
import com.raman.rdsdi.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * This class will return a bean of FakeDataSource by picking values from external properties file we created
 */
@Configuration
//@PropertySource({"classpath:datasources.properties", "classpath:jms.properties"}) // before spring 4
@PropertySources({
        @PropertySource("classpath:datasources.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    /** this class will have environment variables */
    @Autowired
    Environment environment;

    /** Create 3 properties we added in properties file */
    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String dburl;

    /** below are values for JMS loaded for jms.properties file */
    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("guru.jms.url")
    String jmsUrl;

    /** This bean is required to get values from external properties file and load it into variables with @Value annotation */
    /** R--> If you don't provide 'static' keyword here, it won't work at all. It's because we want PropertySourcesPlaceholderConfigurer bean at the very start
     *      so making it static will call this method at Class loading and then @Value annotation will be used */
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUrl(dburl);

        // instead of property file, now we are getting username from environment variable
        // if we provide 'JAVA_HOME' it will print the java path
        fakeDataSource.setUser(environment.getProperty("username"));

        fakeDataSource.setPassword(password);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource() {
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setJmsUsername(jmsUsername);
        fakeJmsSource.setJmsPassword(jmsPassword);
        fakeJmsSource.setJmsUrl(jmsUrl);
        return fakeJmsSource;
    }
}
