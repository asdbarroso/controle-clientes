package com.asdb.controleclientes.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asdb.controleclientes.entities.Telephone;

@RestController
@RequestMapping(value = "/telephones")
public class TelephoneResource {

	@GetMapping
	public ResponseEntity<Telephone> findAll() {
		Telephone telephone = new Telephone(1L, "(021) 3333-4444", "Fixo");
		return ResponseEntity.ok().body(telephone);
	}
}
