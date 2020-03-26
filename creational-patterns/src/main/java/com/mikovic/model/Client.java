package com.mikovic.model;



import com.mikovic.entities.mistake.interfaces.Subject;

import java.util.ArrayList;

public class Client extends Person  implements Subject {
    private ArrayList<Doctor> doctors;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Client(String firstName ) {
        super(firstName);
    }

    public Client() {
        super();
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public void presentation() {
        System.out.println("Я клиент");
    }

    public void show() {
        showPerson();
        System.out.println("Ваш клиент.");
    }
}
