package com.asdb.controleclientes.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asdb.controleclientes.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<Client> findAll() {
		Client client = new Client(1L, "Paul", "Street Limites, 317");
		return ResponseEntity.ok().body(client);
	}
}
