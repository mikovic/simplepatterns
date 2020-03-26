package com.mikovic.model;

import com.mikovic.entities.mistake.interfaces.Command;

import java.util.ArrayList;
import java.util.HashMap;

public class Registratura  extends Clinica{
    private final HashMap<String, Command> commandMap = new HashMap<>();
    private ArrayList<Operator> registrators;

    public Registratura(){
        this.registrators = new ArrayList<>();
    }

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }

    public void addRegistrator(Operator operator){
        registrators.add(operator);
    }

    public ArrayList<Operator> getRegistrators() {
        return registrators;
    }

    public void setRegistrators(ArrayList<Operator> registrators) {
        this.registrators = registrators;
    }

}
