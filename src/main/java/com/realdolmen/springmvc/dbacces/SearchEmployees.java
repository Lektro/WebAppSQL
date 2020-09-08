package com.realdolmen.springmvc.dbacces;

import java.sql.*;

import static com.realdolmen.springmvc.dbacces.DataSource.*;

public class SearchEmployees {
    public static Connection searchAllEmployees() {

        Connection conn = null;
        String sql = String.format("SELECT * FROM thezoo.employees;");

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
                return conn;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return conn;
    }
}
