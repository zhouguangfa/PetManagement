package com.example.pet.config;

import com.example.pet.service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
    
    @Value("${pet.type:dog}")
    private String petType;
    
    @Bean
    public PetService petService() {
        switch (petType.toLowerCase()) {
            case "cat":
                return new CatService();
            case "bird":
                return new BirdService();
            case "dog":
            default:
                return new DogService();
        }
    }
}