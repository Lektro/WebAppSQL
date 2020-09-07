package com.realdolmen.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.realdolmen.springmvc.services.EmployeeManager;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public ModelAndView getAllEmployees(ModelMap model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return new ModelAndView("employeeListDisplay", model);
    }
}