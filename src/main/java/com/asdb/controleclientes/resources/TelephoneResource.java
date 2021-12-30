package com.asdb.controleclientes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asdb.controleclientes.entities.Contact;
import com.asdb.controleclientes.services.TelephoneService;

@RestController
@RequestMapping(value = "/telephones")
public class TelephoneResource {

	@Autowired
	private TelephoneService service;
	
	
	@GetMapping
	public ResponseEntity<List<Contact>> findAll() {
		List<Contact> telephone = service.findAll();
		return ResponseEntity.ok().body(telephone);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Contact> findById(@PathVariable Long id){
		Contact telephone = service.findById(id);
		return ResponseEntity.ok().body(telephone);
	}
}
