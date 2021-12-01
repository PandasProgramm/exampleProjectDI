package com.example.exampleprojectdi.services.config;

import com.example.exampleprojectdi.services.ConstructorGreetingService;
import com.example.exampleprojectdi.services.PropertyGreetingService;
import com.example.exampleprojectdi.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class GreetingServiceConfig {

    static ConstructorGreetingService constructorGreetingService;
    static PropertyGreetingService propertyGreetingService;
    static SetterGreetingService setterGreetingService;

    @Bean
    public static ConstructorGreetingService getConstructorGreetingService() {
        return Objects.requireNonNullElseGet(constructorGreetingService, ConstructorGreetingService::new);
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
    @Bean
    public static PropertyGreetingService getPropertyGreetingService() {
        return Objects.requireNonNullElseGet(propertyGreetingService, PropertyGreetingService::new);
    }

    @Bean
    public static SetterGreetingService getSetterGreetingService() {
        return Objects.requireNonNullElseGet(setterGreetingService, SetterGreetingService::new);
    }

}
