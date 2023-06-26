package fr.ouadi.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import fr.ouadi.myApi.model.Animal;
import fr.ouadi.myApi.service.AnimalService;

public class AnimalController {
    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animal")
    public Animal getAnimal(@RequestParam int id){
        Animal animal = animalService.getAnimal(id);
        return animal;
    } 

    @PostMapping("/animal")
    public Animal createAnimal(@RequestBody AnimalRequest body){
        
    }
}

