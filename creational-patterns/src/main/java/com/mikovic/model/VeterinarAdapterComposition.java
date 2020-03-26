package com.mikovic.model;

import com.mikovic.entities.mistake.interfaces.Medication;
import com.mikovic.entities.mistake.interfaces.Subject;

public class VeterinarAdapterComposition implements Medication {

    private Veterinar veterinar = new Veterinar();
    @Override
    public void examination(Subject subject) {
        veterinar.observer(subject);

    }

    @Override
    public void treatment(Subject subject) {
        veterinar.thereapy(subject);
    }
}
