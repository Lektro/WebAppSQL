package com.realdolmen.springmvc.services;

import java.util.List;

import com.realdolmen.springmvc.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realdolmen.springmvc.doa.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO dao;

    public List<Employee> getAllEmployees()
    {
        return dao.getAllEmployees();
    }

    @Override
    public void addEmployee(Employee employee) {
        dao.addEmployee(employee);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

}