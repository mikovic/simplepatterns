package com.mikovic.model;

public abstract class Operator extends Person {
    private Operator next;

    public Operator(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Operator(){
        super();
    }

    public Operator(String firstName) {
        super(firstName);

    }

    public void handle(Client client) {
        if(next != null)
            next.handle(client);
    }

    public Operator link(Operator next) {
        this.next = next;
        return next;
    }

}
