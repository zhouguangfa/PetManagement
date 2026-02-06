package com.example.pet.service;

import org.springframework.stereotype.Service;

@Service
public class BirdService implements PetService {
    @Override
    public String speak() {
        return "啾啾！我是鸟";
    }
}