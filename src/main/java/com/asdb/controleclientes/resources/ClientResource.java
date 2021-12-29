package com.asdb.controleclientes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asdb.controleclientes.entities.Client;
import com.asdb.controleclientes.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> client = clientService.findAll();
		return ResponseEntity.ok().body(client);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> finfById(@PathVariable Long id){
		Client client = clientService.findById(id);
		return ResponseEntity.ok().body(client);
	}
}
