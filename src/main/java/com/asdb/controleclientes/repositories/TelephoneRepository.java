package com.asdb.controleclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asdb.controleclientes.entities.Contact;

public interface TelephoneRepository extends JpaRepository<Contact, Long>{

}
