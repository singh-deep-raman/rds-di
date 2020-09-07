package com.raman.rdsdi;

import com.raman.rdsdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RdsDiApplication {

    public static void main(String[] args) {
        /** SpringApplication.run() returns ConfigurableApplicationContext instance, which you can save in ApplicationContext too */
        ApplicationContext context = SpringApplication.run(RdsDiApplication.class, args);

        /** Get reference of Controller class from Spring Context */
        MyController myController = (MyController) context.getBean("myController");
        // R --> By default while creating controllers, spring assigns name same as class name but with camel case

        String helloMsg = myController.sayHello();
        System.out.println(helloMsg);

        // R --> This application will run and stop when main method finishes, in case of web application a web server is configured automatically
    }

}
