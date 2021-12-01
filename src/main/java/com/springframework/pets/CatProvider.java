package com.springframework.pets;

public class CatProvider implements Provider {
    @Override
    public CatPetServiceImpl create() {
        return new CatPetServiceImpl();
    }
}
