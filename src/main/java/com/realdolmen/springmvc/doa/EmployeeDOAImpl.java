package com.realdolmen.springmvc.doa;

import java.util.ArrayList;
import java.util.List;

import com.realdolmen.springmvc.models.EmployeeVO;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDOAImpl implements EmployeeDOA {
    public List<EmployeeVO> getAllEmployees()
    {
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setFirstName("Lokesh");
        vo1.setLastName("Gupta");
        employees.add(vo1);

        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Raj");
        vo2.setLastName("Kishore");
        employees.add(vo2);

        return employees;
    }
}
