package com.realdolmen.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView homepage() {
        return new ModelAndView("index", new HashMap<>());
    }
}
