package com.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class PetServiceFactory {

    public static PetService getInstance(Provider petProvider) {
        return petProvider.create();
    }
}
