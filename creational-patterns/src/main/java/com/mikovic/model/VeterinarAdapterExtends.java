package com.mikovic.model;

import com.mikovic.interfaces.Medication;
import com.mikovic.interfaces.Subject;

public class VeterinarAdapterExtends extends Veterinar implements Medication {
    public VeterinarAdapterExtends(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public VeterinarAdapterExtends() {
        super();
    }

    public VeterinarAdapterExtends(String firstName) {
        super(firstName);
    }

    @Override
    public void examination(Subject subject) {
        observer(subject);
    }

    @Override
    public void treatment(Subject subject) {
        thereapy(subject);
    }
}
