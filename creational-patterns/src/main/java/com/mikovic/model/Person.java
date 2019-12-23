package com.mikovic.model;
import java.time.LocalDate;

public class Person extends BaseEntity{
    protected LocalDate date;
    protected String firstName;
    protected String lastName;
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void showPerson() {
        System.out.print("Я "+firstName + " "+lastName +".");
    }
}
