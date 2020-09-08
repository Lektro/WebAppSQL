package com.realdolmen.springmvc.doa;

import com.realdolmen.springmvc.models.EmployeeVO;

import java.util.List;

public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}