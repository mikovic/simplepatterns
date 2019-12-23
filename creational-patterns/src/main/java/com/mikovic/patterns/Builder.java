package com.mikovic.patterns;

import com.mikovic.model.Client;
import com.mikovic.model.Doctor;
import com.mikovic.model.Visit;

public abstract class Builder {
    protected Visit visit;
    public abstract Visit buildVisit(Client client, Doctor doctor);
}
