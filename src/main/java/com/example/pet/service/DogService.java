package com.example.pet.service;

import org.springframework.stereotype.Service;

@Service("dog")
public class DogService implements PetService {
    @Override
    public String speak() {
        return "汪汪！我是狗";
    }
    
    @Override
    public String getType() {
        return "dog";
    }
}