package com.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class PetServiceDefault implements PetService {
    @Override
    public String getPetType() {
        return "awesome animals";
    }
}
