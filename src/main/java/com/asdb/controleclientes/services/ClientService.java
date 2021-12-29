package com.asdb.controleclientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asdb.controleclientes.entities.Client;
import com.asdb.controleclientes.repositories.ClientRepository;
import com.asdb.controleclientes.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clienteRepository;

	public List<Client> findAll(){
		return clienteRepository.findAll();
	}
	
	public Client findById(Long id) {
		Optional <Client> client = clienteRepository.findById(id);
		return client.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
}
