package com.example.pet.service;

import org.springframework.stereotype.Service;

@Service
public class DogService implements PetService {
    @Override
    public String makeSound() {
        return "汪汪汪！";
    }
    
    @Override
    public String getPetType() {
        return "狗";
    }
}