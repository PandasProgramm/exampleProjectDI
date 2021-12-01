package com.example.exampleprojectdi.controllers;

import com.springframework.pets.CatPetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatPetControllerTest {

    CatPetController controller;
    @BeforeEach
    void setUp() {
        this.controller = new CatPetController(new CatPetService());
    }

    @Test
    void whichPetIsTheBest() {
        System.out.println(this.controller.whichPetIsTheBest());
    }
}
