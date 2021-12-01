package com.springframework.pets;

import org.springframework.stereotype.Service;

//@Service
public class CatPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Cat`s are the best!";
    }
}
