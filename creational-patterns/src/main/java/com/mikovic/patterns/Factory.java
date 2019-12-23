package com.mikovic.patterns;


import com.mikovic.interfaces.Subject;
import com.mikovic.model.Client;
import com.mikovic.model.Doctor;

public class Factory {
    public Subject getCurrentPerson(String person){
        Subject subject = null;
        if(person.equals("client")){
            subject = new Client();
        }else if(person.equals("doctor")){
            subject = new Doctor();
        }
        return subject;
    }
}
