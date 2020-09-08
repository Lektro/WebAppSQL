package com.realdolmen.springmvc.doa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.realdolmen.springmvc.models.EmployeeVO;

import static com.realdolmen.springmvc.dbacces.DataSource.*;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    public List<EmployeeVO> getAllEmployees() {
        Connection conn = null;
        String sql = String.format("SELECT * FROM thezoo.employees;");
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
        try {
            conn = DriverManager.getConnection(url, user, pass);
            {
                System.out.println("Connection established!");
                Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = st.executeQuery(sql);

                /** While there are matches found print out the result */
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String firstName = rs.getString(2);
                    String lastName = rs.getString(3);
                    System.out.format("%s %s %s %n", "Employee ID: " + id, "First Name: " + firstName, " Last Name: " + lastName);
                }
                return employees;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();

            return employees;
        }
    }
}