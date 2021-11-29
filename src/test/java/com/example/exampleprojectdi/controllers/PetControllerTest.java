package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.PetServiceDefault;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PetControllerTest {

    PetController petController;

    @BeforeEach
    void setUp() {
        this.petController = new PetController(new PetServiceDefault());
    }

    @Test
    void whichPetIsTheBest() {
        System.out.println(this.petController.whichPetIsTheBest());
    }
}
