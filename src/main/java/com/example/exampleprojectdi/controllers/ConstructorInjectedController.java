package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.GreetingService;
import com.example.exampleprojectdi.services.ConstructorGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingService service;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") ConstructorGreetingService greetingServiceImplementation) {
        this.service = greetingServiceImplementation;
    }

    public String greeting() {
        return this.service.sayGreeting();
    }
}
