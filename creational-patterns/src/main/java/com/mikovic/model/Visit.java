package com.mikovic.model;

import com.mikovic.interfaces.Subject;

import java.time.LocalDate;

public class Visit extends BaseEntity implements Subject {
    private LocalDate date;
    private String complaint;
    private Client client;
    private Doctor doctor;
    private Treatment treatment;
    public Visit() {
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    @Override
    public void presentation() {
        System.out.println("Прием осуществляет врач  "+ doctor.firstName +" "+ doctor.lastName +".");
        System.out.println("Пациент  "+ client.firstName +" "+ client.lastName +".");
    }
}
