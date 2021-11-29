package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.DogPetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogPetControllerTest {

    DogPetController dogPetController;
    @BeforeEach
    void setUp() {
        this.dogPetController = new DogPetController(new DogPetService());
    }

    @Test
    void whichPetIsTheBest() {
        System.out.println(this.dogPetController.whichPetIsTheBest());
    }
}
