package com.asdb.controleclientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asdb.controleclientes.entities.Telephone;
import com.asdb.controleclientes.repositories.TelephoneRepository;
import com.asdb.controleclientes.services.exceptions.ResourceNotFoundException;

@Service
public class TelephoneService {

	@Autowired
	private TelephoneRepository repository;

	public List<Telephone> findAll(){
		return repository.findAll();
	}
	
	public Telephone findById(Long id) {
		Optional <Telephone> telephone = repository.findById(id);
		return telephone.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
}
