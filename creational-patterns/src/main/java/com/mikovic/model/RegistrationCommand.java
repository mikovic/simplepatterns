package com.mikovic.model;

import com.mikovic.interfaces.Command;

public class RegistrationCommand implements Command {
    private Registrator registrator;
    private  Client client;


    public RegistrationCommand(Registrator registrator, Client client){
        this.registrator = registrator;
        this.client = client;
    }

    


    @Override
    public void execute() {
        registrator.register(client);
    }
}
