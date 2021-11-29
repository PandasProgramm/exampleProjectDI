package com.example.exampleprojectdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dog`s are the best!";
    }
}
