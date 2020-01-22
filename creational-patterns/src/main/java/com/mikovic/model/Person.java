package com.mikovic.model;
import java.time.LocalDate;

public abstract class  Person extends BaseEntity{
    protected LocalDate dateReg;
    protected LocalDate birthday;
    protected String firstName;
    protected String lastName;
    protected String description;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateReg = LocalDate.now();
    }
    public Person(String firstName){
        this.firstName = firstName;
        this.dateReg = LocalDate.now();

    }
    public Person(){

    }

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
        System.out.print("Я "+ firstName + " "+lastName +". Дата рождения: " + birthday+ "\n"+
        description +". Мой ID: "+id +". ");
    }

    public LocalDate getDateReg() {
        return dateReg;
    }

    public void setDateReg(LocalDate dateReg) {
        this.dateReg = dateReg;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
