package com.example.pet.service;

import org.springframework.stereotype.Service;

@Service("catService")
public class CatService implements PetService {
    @Override
    public String speak() {
        return "喵喵！我是猫";
    }
    
    @Override
    public String getType() {
        return "cat";
    }
}