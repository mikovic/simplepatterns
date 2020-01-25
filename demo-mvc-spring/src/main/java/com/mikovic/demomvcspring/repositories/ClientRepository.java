package com.mikovic.demomvcspring.repositories;

import com.mikovic.demomvcspring.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
}
