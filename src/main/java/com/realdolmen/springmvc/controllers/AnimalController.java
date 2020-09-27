package com.realdolmen.springmvc.controllers;

import com.realdolmen.springmvc.models.Animal;
import com.realdolmen.springmvc.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @RequestMapping(value = "/getAllAnimals", method = RequestMethod.GET)
    public ModelAndView searchAnimals(ModelMap model) {
        model.addAttribute("animals", animalService.getAllAnimals());
        return new ModelAndView("animalListDisplay", model);
    }

    @RequestMapping("/{id}/edit") // <---- Creates url in the form of localhost:port/employee/{id}/edit
    public ModelAndView showEditPage(@PathVariable("id") int id, ModelMap modelMap) {
        modelMap.addAttribute("animal", animalService.findById(id));
        return new ModelAndView("editAnimal", modelMap);
    }

    @GetMapping("/add")
    public ModelAndView showAddView(ModelMap modelMap) {
        modelMap.addAttribute("ani",new Animal());
        return new ModelAndView("addAnimal", modelMap);
    }

    @PostMapping("/add")
    public ModelAndView addAnimal(@ModelAttribute("animal") Animal animal) {
        animalService.addAnimal(animal);
        return new ModelAndView("redirect:/animal/getAllAnimals");
    }

    @PostMapping("/{id}/edit")
    public ModelAndView save(@ModelAttribute("animal") Animal animal) {
        animalService.update(animal);
        return new ModelAndView("redirect:/animal/getAllAnimals");
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
        animalService.deleteById(id);
        return new ModelAndView("redirect:/animal/getAllAnimals");
    }
}
