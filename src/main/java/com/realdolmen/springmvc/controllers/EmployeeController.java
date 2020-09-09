package com.realdolmen.springmvc.controllers;

import com.realdolmen.springmvc.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import com.realdolmen.springmvc.services.EmployeeManager;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeManager employeeService;

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public ModelAndView searchEmployees(ModelMap model)
    {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return new ModelAndView("employeeListDisplay", model);
    }
    @GetMapping("/add")
    public ModelAndView showAddView(ModelMap modelMap) {
        return new ModelAndView("addEmployee", modelMap);
    }
    @PostMapping("/add")
    public ModelAndView addEmployee(@ModelAttribute Employee employee, ModelMap modelMap) {
        employeeService.addEmployee(employee);
        return new ModelAndView("redirect:/employee/getAllEmployees");
    }
}