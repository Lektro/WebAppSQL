package com.realdolmen.springmvc.doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.realdolmen.springmvc.models.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

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

        EmployeeVO vo3 = new EmployeeVO();
        vo3.setId(3);
        vo3.setFirstName("Kevin");
        vo3.setLastName("van der Kruk");
        employees.add(vo3);

        return employees;
    }
}