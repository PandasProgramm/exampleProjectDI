package com.example.exampleprojectdi.services.config;

import com.example.exampleprojectdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Configuration
public class GreetingServiceConfig {

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

    @Primary
    @Bean
    PrimaryGreetingService primaryGreeting() {
        return new PrimaryGreetingService();
    }

    @Bean("i18nService")
    @Profile({"EN","default"})
    I18nEnglishService i18nEnglishService() {
        return new I18nEnglishService();
    }

    @Bean("i18nService")
    @Profile("ES")
    I18nSpanishService i18nSpanishService() {
        return new I18nSpanishService();
    }

    /*
    static ConstructorGreetingService constructorGreetingService;
    static PropertyGreetingService propertyGreetingService;
    static SetterGreetingService setterGreetingService;

    @Bean
    public static ConstructorGreetingService getConstructorGreetingService() {
        return Objects.requireNonNullElseGet(constructorGreetingService, ConstructorGreetingService::new);
    }
    @Bean
    public static PropertyGreetingService getPropertyGreetingService() {
        return Objects.requireNonNullElseGet(propertyGreetingService, PropertyGreetingService::new);
    }

    @Bean
    public static SetterGreetingService getSetterGreetingService() {
        return Objects.requireNonNullElseGet(setterGreetingService, SetterGreetingService::new);
    }
 */
}
