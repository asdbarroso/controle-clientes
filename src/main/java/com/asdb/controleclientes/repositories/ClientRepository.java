package com.asdb.controleclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asdb.controleclientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
