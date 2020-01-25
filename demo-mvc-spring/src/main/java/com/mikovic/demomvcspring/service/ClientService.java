package com.mikovic.demomvcspring.service;



import com.mikovic.demomvcspring.model.Client;

import java.util.List;

public interface ClientService {
    public List<Client> findAll();
    public Client create (Client client);
    public Client findById(int id);
    public void delete (int id);
}
