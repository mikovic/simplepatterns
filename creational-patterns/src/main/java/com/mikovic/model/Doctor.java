package com.mikovic.model;





import com.mikovic.interfaces.Subject;

import java.util.ArrayList;

public class Doctor extends Person implements Subject {
    private ArrayList<Client> clients;
    private String specialty;

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Doctor(String firstName) {
        super(firstName);
    }
    public Doctor() {
        super();
    }
    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    @Override
    public void presentation() {
        System.out.println("Я доктор");
    }
    public void show() {
        showPerson();
        System.out.println("Ваш доктор.");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
