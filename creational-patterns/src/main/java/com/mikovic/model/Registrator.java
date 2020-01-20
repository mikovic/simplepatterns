package com.mikovic.model;

public class Registrator extends Operator {
    public Registrator(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Registrator(String firstName){
        super(firstName);
    }

    public Registrator(){
        super();
    }

    public void register(Client client){
        System.out.println(getFirstName() + " регистрирует "+ client.getFirstName() + ", рождение: " +client.getBirthday());
    }

    @Override
    public void handle(Client client) {
        if(isBusy()) {
            System.out.printf("Регистратор %s занят\n", getFirstName());
            super.handle(client);
        }
        else {
            System.out.printf("Регистратор %s обрабатывает клиента %s\n",
                    getFirstName(), client.getFirstName());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }

    // вероятность занятости регистратора
    private final double probability = 0.8;



}
