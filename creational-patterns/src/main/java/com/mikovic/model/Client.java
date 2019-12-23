package com.mikovic.model;



import com.mikovic.interfaces.Subject;

import java.util.ArrayList;

public class Client extends Person  implements Subject {
    private ArrayList<Doctor> doctors;
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
