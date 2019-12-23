package com.mikovic.patterns;

import com.mikovic.model.Client;
import com.mikovic.model.Doctor;
import com.mikovic.model.Visit;

public class VisitBuilder  extends Builder{
    @Override
    public Visit buildVisit(Client client, Doctor doctor) {
        visit = new Visit();
        visit.setClient(client);
        visit.setDoctor(doctor);
        return visit;
    }
}
