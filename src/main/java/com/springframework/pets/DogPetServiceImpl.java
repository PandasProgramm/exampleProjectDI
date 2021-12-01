package com.springframework.pets;

import org.springframework.stereotype.Service;

//@Service
public class DogPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Dog`s are the best!";
    }
}
