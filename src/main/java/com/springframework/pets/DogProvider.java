package com.springframework.pets;

public class DogProvider implements Provider {
    @Override
    public DogPetServiceImpl create() {
        return new DogPetServiceImpl();
    }
}
