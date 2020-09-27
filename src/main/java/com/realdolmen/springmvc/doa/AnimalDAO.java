package com.realdolmen.springmvc.doa;

import com.realdolmen.springmvc.models.Animal;
import java.util.List;

public interface AnimalDAO {
    List<Animal> getAllAnimals();
    int addAnimal(Animal animal);
    void deleteById(int id);
    void update(Animal animal);
    Animal findById(int id);
}