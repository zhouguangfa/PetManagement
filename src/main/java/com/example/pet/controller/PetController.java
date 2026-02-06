package com.example.pet.controller;

import com.example.pet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
    
    @Autowired
    private PetService petService;
    
    @GetMapping("/pet/speak")
    public String makePetSpeak() {
        return petService.speak();
    }
}