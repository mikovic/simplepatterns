package com.mikovic.service;


import com.mikovic.model.Client;

import java.sql.Connection;

public interface ClientService {

    public void create(Connection conn, Client client);
    public void update(Connection conn,Client client);
    public void delete(Connection conn,Client client);
    public Client find(Connection conn, int id );
    public void findAll(Connection conn);
}
