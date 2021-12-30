package com.asdb.controleclientes.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.asdb.controleclientes.entities.Client;
import com.asdb.controleclientes.entities.Contact;
import com.asdb.controleclientes.entities.enums.TypeOfContact;
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
		
		Contact t1 = new Contact(null, "(021) 3333-4444", "Fixo", TypeOfContact.PHONE, c1);
		Contact t2 = new Contact(null, "(021) 9999-8888", "Celular", TypeOfContact.MOBILE, c1);
		Contact t3 = new Contact(null, "jack@gmail.com", "Fixo", TypeOfContact.EMAIL, c2);
		Contact t4 = new Contact(null, "paul@gmail.com", "Fixo", TypeOfContact.EMAIL, c1);
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(t1);
		contacts.add(t2);
		c1.setTelephones(contacts);
		List<Contact> contacts2 = new ArrayList<>();
		contacts2.add(t3);
		contacts2.add(t4);
		c2.setTelephones(contacts2);
		
		clientRepository.saveAll(Arrays.asList(c1, c2));

	}

}
