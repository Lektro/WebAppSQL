package com.realdolmen.springmvc.models;

public class Employee {
    private static final long serialVersionUID = 1L;
    private int id;
    private String firstName;
    private String lastName;

    //Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Override
    public String toString() {
        return "Employee [id =" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
