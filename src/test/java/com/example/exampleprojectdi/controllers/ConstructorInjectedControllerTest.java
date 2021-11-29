package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    @Test
    void greeting() {
        System.out.println(controller.greeting());
    }
}
