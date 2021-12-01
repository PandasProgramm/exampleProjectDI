package com.example.exampleprojectdi.services;

import org.springframework.stereotype.Service;


public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World-Property";
    }
}
