package com.realdolmen.springmvc.services;

import com.realdolmen.springmvc.models.Animal;
import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimals();
    void addAnimal(Animal animal);
    void deleteById(int id);
    Animal findById(int id);
    void update(Animal animal);
}
