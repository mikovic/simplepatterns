package com.mikovic.model;

import java.util.ArrayList;

public class Clinica extends BaseEntity {
    private ArrayList<Doctor> doctors;
    private ArrayList<Client> clients;

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
