package com.example.exampleprojectdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DogPetController {

    private final PetService dogPetService;

    public DogPetController(@Qualifier("dogPetServiceImpl") PetService dogPetService) {
        this.dogPetService = dogPetService;
    }

    public String whichPetIsTheBest() {
        return this.dogPetService.getPetType();
    }
}
