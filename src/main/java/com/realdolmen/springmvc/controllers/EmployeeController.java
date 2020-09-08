package com.realdolmen.springmvc.controllers;

import com.realdolmen.springmvc.models.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.realdolmen.springmvc.services.EmployeeManager;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    @RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
    public ModelAndView getAllEmployees(ModelMap model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return new ModelAndView("employeeListDisplay", model);
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser
            (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        EmployeeVO n = new EmployeeVO();
        n.setId(n.getId());
        n.setFirstName(n.getFirstName());
        n.setLastName(n.getLastName());
        userRepository.save(n);
        return "Saved";
    }
}