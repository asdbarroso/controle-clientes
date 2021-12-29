package com.asdb.controleclientes.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.asdb.controleclientes.entities.Client;
import com.asdb.controleclientes.entities.Telephone;
import com.asdb.controleclientes.repositories.ClientRepository;
import com.asdb.controleclientes.repositories.TelephoneRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private TelephoneRepository telephoneRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Client c1 = new Client(null, "Paul", "Street Limites, 100");
		Client c2 = new Client(null, "Jack", "Street Sta Cruz, 1200");
		
		clientRepository.saveAll(Arrays.asList(c1, c2));
		
		Telephone t1 = new Telephone(null, "(021) 3333-4444", "Fixo");
		Telephone t2 = new Telephone(null, "(021) 9999-8888", "Celular");
		
		telephoneRepository.saveAll(Arrays.asList(t1, t2));

	}

}
