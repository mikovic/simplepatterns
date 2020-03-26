package com.mikovic.entities.mistake;

import com.mikovic.entities.mistake.interfaces.Moveable;
import com.mikovic.entities.mistake.interfaces.Stopable;

public class Lorry extends Car implements Moveable, Stopable {


    @Override
    public void open() {
        System.out.println("Lorry is open");
    }


    public void move() {
        System.out.println("Lorry is moving");

    }


    public void stop() {
        System.out.println("Lorry is stop");

    }
}

