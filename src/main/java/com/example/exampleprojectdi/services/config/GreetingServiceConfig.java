package com.example.exampleprojectdi.services.config;

import com.example.exampleprojectdi.repository.EnglishGreetingRepository;
import com.example.exampleprojectdi.repository.EnglishGreetingRepositoryImpl;
import com.example.exampleprojectdi.services.*;
import com.springframework.pets.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }
    @Bean("factoryPetServiceImpl")
    PetService catPetService(){
        return PetServiceFactory.getInstance(new CatProvider());
    }
    @Bean("dogPetServiceImpl")
    PetService dogPetService() { return PetServiceFactory.getInstance(new DogProvider()); }

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
    I18nEnglishService i18nEnglishService(EnglishGreetingRepository repository) {
        return new I18nEnglishService(repository);
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
