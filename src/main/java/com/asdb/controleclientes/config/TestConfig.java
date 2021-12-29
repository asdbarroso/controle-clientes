package com.asdb.controleclientes.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.asdb.controleclientes.entities.Client;
import com.asdb.controleclientes.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Client c1 = new Client(null, "Paul", "Street Limites, 100");
		Client c2 = new Client(null, "Jack", "Street Sta Cruz, 1200");
		
		clientRepository.saveAll(Arrays.asList(c1, c2));

	}

}
