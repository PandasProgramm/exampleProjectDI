package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController{

    @Autowired
    @Qualifier("propertyGreetingService")
   GreetingService greetingService;
    
   
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
