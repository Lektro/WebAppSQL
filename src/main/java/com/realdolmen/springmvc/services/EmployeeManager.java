package com.realdolmen.springmvc.services;

import com.realdolmen.springmvc.models.EmployeeVO;

import java.util.List;

public interface EmployeeManager {
    public List<EmployeeVO> getAllEmployees();
}
