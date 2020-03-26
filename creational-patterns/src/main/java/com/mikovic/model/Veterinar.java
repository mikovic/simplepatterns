package com.mikovic.model;

import com.mikovic.entities.mistake.interfaces.Subject;

public class Veterinar extends Person implements Subject {
    public Veterinar(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Veterinar(String firstName) {
        super(firstName);
    }
    public Veterinar() {
        super();
    }

    @Override
    public void presentation() {
        System.out.println("Я ветеринар ");
    }


    public void observer (Subject subject) {
        presentation();
        System.out.print("Сегодня у меня на осмотре ");
        subject.presentation();
    }


    public void thereapy(Subject subject) {
        System.out.print("Пациенту ");
        subject.presentation();
        System.out.println("Я делаю клизму");

    }
}
