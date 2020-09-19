package com.raman.rdsdi.config;

import com.raman.rdsdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * This class will return a bean of FakeDataSource by picking values from external properties file we created
 */
@Configuration
@PropertySource("classpath:datasources.properties") // it is must to specify from which properties file to load values
public class PropertyConfig {

    /** Create 3 properties we added in properties file */

    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String dburl;

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
        fakeDataSource.setUser(username);
        fakeDataSource.setPassword(password);
        return fakeDataSource;
    }
}
