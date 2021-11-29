package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I9nController {

    private final GreetingService greetingService;

    public I9nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
