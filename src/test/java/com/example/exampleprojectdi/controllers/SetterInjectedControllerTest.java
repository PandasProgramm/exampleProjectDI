package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setup() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
