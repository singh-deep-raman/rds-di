package com.raman.rdsdi;

import com.raman.rdsdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RdsDiApplication {

    public static void main(String[] args) {
        /** SpringApplication.run() returns ConfigurableApplicationContext instance, which you can save in ApplicationContext too */
        ApplicationContext context = SpringApplication.run(RdsDiApplication.class, args);

        System.out.println("\nPrimary Bean greeting:");
        /** Get reference of Controller class from Spring Context */
        MyController myController = (MyController) context.getBean("myController");
        // R --> By default while creating controllers, spring assigns name same as class name but with camel case

        System.out.println(myController.sayHello());

        // R --> This application will run and stop when main method finishes, in case of web application a web server is configured automatically

        System.out.println("\nProperty based DI with Spring");
        // if you don't have Spring Stereotype annotation i.e. @Controller on PropertyInjectorController, then you will get error as
        // No bean named 'PropertyInjectorController' available
        PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
        System.out.println(propertyInjectorController.greetMessage());
        /** No qualifying bean of type 'com.raman.rdsdi.service.GreetingService' available
         *  Above error occurs if you are using @Autowired on a property but that is not Spring Managed Component i.e. no annotation
         */

        System.out.println("\nSetter based DI with Spring");
        SetterInjectorController setterInjectorController = (SetterInjectorController) context.getBean("setterInjectorController");
        System.out.println(setterInjectorController.greetMessage());

        System.out.println("\nConstructor based DI with Spring");
        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) context.getBean("constructorInjectionController");
        System.out.println(constructorInjectionController.greetMessage());

        System.out.println("\nGreeting with Profile");
        I18NController i18NController = (I18NController)context.getBean("i18NController");
        System.out.println(i18NController.greetMessage());
    }

}
