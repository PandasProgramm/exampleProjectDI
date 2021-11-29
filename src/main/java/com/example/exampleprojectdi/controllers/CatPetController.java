package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CatPetController {

    private final PetService petService;

    public CatPetController(@Qualifier("catPetService") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return this.petService.getPetType();
    }
}
