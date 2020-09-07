package com.realdolmen.springmvc.doa;

import java.util.List;

import com.realdolmen.springmvc.models.EmployeeVO;

public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}