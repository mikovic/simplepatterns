package com.mikovic.service;

import com.mikovic.model.Client;
import com.mikovic.repositories.ClientRepository;

import java.sql.Connection;

public class ClientServiceImpl implements ClientService{

    private ClientRepository clientRepository;

    public ClientServiceImpl(){
        this.clientRepository = new ClientRepository();
    }
    @Override
    public void create(Connection conn, Client client) {
        clientRepository.insert(conn, client);

    }

    @Override
    public void update(Connection conn,Client client) {
        clientRepository.update(conn, client);
    }

    @Override
    public void delete(Connection conn,Client client) {
        clientRepository.delete(conn, client);
    }

    @Override
    public Client find(Connection conn, int id) {
        return clientRepository.findById(conn, id);
    }

    @Override
    public void findAll(Connection conn) {
        clientRepository.findAll(conn);
    }
}
