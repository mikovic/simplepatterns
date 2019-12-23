package com.mikovic.patterns;


import com.mikovic.model.Client;
import com.mikovic.model.Doctor;

public abstract class AbsractFactory {
    public abstract Client getClient();
    public abstract Doctor getDoctor();
}
