package com.realdolmen.springmvc.doa;

import com.realdolmen.springmvc.models.Employee;

import java.util.List;

public interface EmployeeDAO
{
    public List<Employee> getAllEmployees();
    public void addEmployee(Employee employee);
}