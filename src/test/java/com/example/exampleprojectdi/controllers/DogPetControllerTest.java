package com.example.exampleprojectdi.controllers;

import com.springframework.pets.DogPetServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogPetControllerTest {

    DogPetController dogPetController;
    @BeforeEach
    void setUp() {
        this.dogPetController = new DogPetController(new DogPetServiceImpl());
    }

    @Test
    void whichPetIsTheBest() {
        System.out.println(this.dogPetController.whichPetIsTheBest());
    }
}
