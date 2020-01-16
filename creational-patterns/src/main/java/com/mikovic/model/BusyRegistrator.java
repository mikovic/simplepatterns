package com.mikovic.model;

public class BusyRegistrator extends Operator {
    private Client client;

    public BusyRegistrator(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public BusyRegistrator(String firstName){
        super(firstName);
    }

    public BusyRegistrator(){
        super();
    }

    @Override
    public void handle(Client client) {
        if(this.client == client)
            System.out.println("Все регистраторы заняты, пожалуйста подождите");
        else
            this.client = client;
        super.handle(client);


    }

}


