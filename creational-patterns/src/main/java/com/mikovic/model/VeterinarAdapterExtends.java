package com.mikovic.model;

import com.mikovic.interfaces.Medication;
import com.mikovic.interfaces.Subject;

public class VeterinarAdapterExtends extends Veterinar implements Medication {
    @Override
    public void examination(Subject subject) {
        observer(subject);
    }

    @Override
    public void treatment(Subject subject) {
        thereapy(subject);
    }
}
