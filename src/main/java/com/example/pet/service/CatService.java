package com.example.pet.service;

import org.springframework.stereotype.Service;

@Service("catService")
public class CatService implements PetService {
    @Override
    public String makeSound() {
        return "喵喵喵！";
    }
    
    @Override
    public String getPetType() {
        return "猫";
    }
}