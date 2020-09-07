package com.realdolmen.springmvc.models;

import java.io.Serializable;


public class EmployeeVO {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String firstName;
    private String lastName;

    //Setters and Getters

    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
