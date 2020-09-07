package com.realdolmen.springmvc.services;

import java.util.List;

import com.realdolmen.springmvc.services.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realdolmen.springmvc.dao.EmployeeDAO;
import com.realdolmen.springmvc.models.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    EmployeeDAO dao;

    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }
}