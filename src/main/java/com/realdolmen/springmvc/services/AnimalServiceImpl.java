package com.realdolmen.springmvc.services;

import com.realdolmen.springmvc.doa.AnimalDAO;
import com.realdolmen.springmvc.models.Animal;
import com.realdolmen.springmvc.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalDAO animalDAO;
    public List<Animal> getAllAnimals()
    {
        return animalDAO.getAllAnimals();
    }

    @Override
    public void addAnimal(Animal animal) {
        animalDAO.addAnimal(animal);
    }
    @Override
    public void deleteById(int id) {
        animalDAO.deleteById(id);
    }

    @Override
    public Animal findById(int id) {
        return animalDAO.findById(id);
    }

    @Override
    public void update(Animal animal) {
        animalDAO.update(animal);
    }

}
