package com.example.exampleprojectdi;

import com.example.exampleprojectdi.controllers.*;
import com.example.exampleprojectdi.services.PrototypBean;
import com.example.exampleprojectdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.example.exampleprojectdi", "com.springframework.pets"})
@SpringBootApplication
public class ExampleProjectDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(ExampleProjectDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.greeting());

        I9nController i9nController = (I9nController) ctx.getBean("i9nController");
        System.out.println(i9nController.sayHello());

        System.out.println("----Homework-----");
        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println(petController.whichPetIsTheBest());
        System.out.println("##Cat##");
        CatPetController catPetController = (CatPetController) ctx.getBean("catPetController");
        System.out.println(catPetController.whichPetIsTheBest());
        System.out.println("##Dog##");
        DogPetController dogPetController = (DogPetController)ctx.getBean("dogPetController");
        System.out.println(dogPetController.whichPetIsTheBest());

        System.out.println("<<<<< Bean Scope >>>>>>");
        SingletonBean singletonBean = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());
        PrototypBean prototypBean = ctx.getBean(PrototypBean.class);
        System.out.println(prototypBean.getMyScope());
        PrototypBean prototypBean2 = ctx.getBean(PrototypBean.class);
        System.out.println(prototypBean2.getMyScope());

    }

}
