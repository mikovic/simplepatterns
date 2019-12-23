package com.mikovic.patterns;


import com.mikovic.model.Client;
import com.mikovic.model.Doctor;

public class PersonFactory extends AbsractFactory {
    @Override
    public Client getClient() {
        return new Client();
    }

    @Override
    public Doctor getDoctor() {
        return new Doctor();
    }
}
