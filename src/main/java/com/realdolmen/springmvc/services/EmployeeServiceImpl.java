package com.realdolmen.springmvc.services;

import java.util.List;

import com.realdolmen.springmvc.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realdolmen.springmvc.doa.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees()
    {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }

}