package com.mikovic.entities.mistake;

import com.mikovic.entities.mistake.interfaces.Moveable;

public class LightWeightCar extends Car implements Moveable {

    @Override
    public void open() {
        System.out.println("LightWeightCar is open");
    }


    public void move() {
        System.out.println("LightWeightCar is moving");

    }
}

