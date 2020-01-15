package com.mikovic.model;

import java.util.ArrayList;

public class Clinica extends BaseEntity {
    private ArrayList<Doctor> doctors;
    private ArrayList<Client> clients;

    public Clinica() {
        this.doctors = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    public void start(){
        System.out.println("Доктора загружены, клиенты добавлены. Клиника работает");
    }

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

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addClient(Client client) {
        clients.add(client);
    }


}
