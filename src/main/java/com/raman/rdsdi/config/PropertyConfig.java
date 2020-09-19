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
public class PropertyConfig {

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

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUrl(dburl);
        fakeDataSource.setUser(username);
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
