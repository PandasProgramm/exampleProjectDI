package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.DogPetService;
import com.example.exampleprojectdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DogPetController {

    private final PetService dogPetService;

    public DogPetController(@Qualifier("dogPetService") PetService dogPetService) {
        this.dogPetService = dogPetService;
    }

    public String whichPetIsTheBest() {
        return this.dogPetService.getPetType();
    }
}
