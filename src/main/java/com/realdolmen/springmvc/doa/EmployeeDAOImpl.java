package com.realdolmen.springmvc.doa;

import com.realdolmen.springmvc.models.Employee;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.realdolmen.springmvc.dbacces.LoginDetails.*;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    public List<Employee> getAllEmployees() {

        Connection conn = null;
        String sql = String.format("SELECT * FROM thezoo.employees;");

        try {
            conn = DriverManager.getConnection(url, user, pass);
            {
                Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = st.executeQuery(sql);
                List<Employee> employeeList = new ArrayList<>();

                /** While there are matches found print out the result */
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String firstName = rs.getString(2);
                    String lastName = rs.getString(3);

                    Employee employee = new Employee();
                    employee.setId(id);
                    employee.setFirstName(firstName);
                    employee.setLastName(lastName);

                    employeeList.add(employee);
                    // System.out.format("%s %s %s %n", "Employee ID: " + id, "First Name: " + firstName, " Last Name: " + lastName);
                }
                return employeeList;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return getAllEmployees();
    }
}
