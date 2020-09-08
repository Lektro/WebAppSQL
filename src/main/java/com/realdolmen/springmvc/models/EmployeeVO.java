package com.realdolmen.springmvc.models;

public class EmployeeVO {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String firstName;
    private String lastName;

    //Setters and Getters

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    // its not this string that gets called to terminal //
    @Override
    public String toString() {
        return "EmployeeVO [id =" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
