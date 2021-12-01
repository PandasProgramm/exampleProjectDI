package com.example.exampleprojectdi.services;

import com.example.exampleprojectdi.repository.EnglishGreetingRepository;


public class I18nEnglishService implements GreetingService{

    private final EnglishGreetingRepository repository;

    public I18nEnglishService(EnglishGreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return "Hello from english people";
    }
}
