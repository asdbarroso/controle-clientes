package com.asdb.controleclientes.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.asdb.controleclientes.entities.Client;
import com.asdb.controleclientes.entities.Telephone;
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
		
		Telephone t1 = new Telephone(null, "(021) 3333-4444", "Fixo", c1);
		Telephone t2 = new Telephone(null, "(021) 9999-8888", "Celular", c1);
		
		List<Telephone> phones = new ArrayList<>();
		phones.add(t1);
		phones.add(t2);
		c1.setTelephones(phones);
		
		clientRepository.save(c1);

	}

}
