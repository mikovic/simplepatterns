package com.mikovic.demomvcspring.service;

import com.mikovic.demomvcspring.repositories.ClientRepository;
import com.mikovic.demomvcspring.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {

        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client findById(int id) {
        return clientRepository.findById( id).orElse(null);
    }

    @Override
    public void delete(int id) {
        clientRepository.deleteById(id);
    }

}
