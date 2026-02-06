package com.example.pet.service;

import org.springframework.stereotype.Service;

@Service
public class BirdService implements PetService {
    
    @Override
    public String makeSound() {
        return "小鸟叽叽喳喳！";
    }
    
    @Override
    public String play() {
        return "小鸟在笼子里跳来跳去！";
    }
}