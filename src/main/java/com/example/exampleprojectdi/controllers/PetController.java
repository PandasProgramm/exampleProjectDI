package com.example.exampleprojectdi.controllers;

import com.example.exampleprojectdi.services.PetServiceDefault;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetServiceDefault petService;

    public PetController(@Qualifier("petServiceDefault") PetServiceDefault petService) {
        this.petService= petService;
    }

    public String whichPetIsTheBest(){
        return this.petService.getPetType();
    }
}
