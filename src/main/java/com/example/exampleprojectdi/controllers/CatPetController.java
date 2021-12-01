package com.example.exampleprojectdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CatPetController {

    private final PetService petService;

    public CatPetController(@Qualifier("factoryPetServiceImpl") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return this.petService.getPetType();
    }
}
