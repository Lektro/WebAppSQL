package com.realdolmen.springmvc.services;

import com.realdolmen.springmvc.models.Employee;

import java.util.List;

public interface EmployeeManager {
    public List<Employee> getAllEmployees();
    public void addEmployee(Employee employee);

}
