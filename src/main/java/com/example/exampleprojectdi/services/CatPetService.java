package com.example.exampleprojectdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cat`s are the best!";
    }
}
