package com.example.exampleprojectdi.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello from english people";
    }
}
