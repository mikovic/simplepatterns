package com.mikovic.model;





import com.mikovic.interfaces.Subject;

import java.util.ArrayList;

public class Doctor extends Person implements Subject {
    private ArrayList<Client> clients;
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
}
