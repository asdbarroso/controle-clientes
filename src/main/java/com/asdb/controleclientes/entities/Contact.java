package com.asdb.controleclientes.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.asdb.controleclientes.entities.enums.TypeOfContact;

@Entity
@Table(name = "tb_telephone")
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String description;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	private Integer typeContact;

	public Contact() {
		super();
	}

	public Contact(Long id, String number, String description, TypeOfContact typeContact, Client client) {
		super();
		this.id = id;
		this.number = number;
		this.description = description;
		setTypeContact(typeContact);
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public TypeOfContact getTypeContact() {
		return TypeOfContact.valueOf(typeContact);
	}

	public void setTypeContact(TypeOfContact typeContact) {
		if (typeContact != null) {
			this.typeContact = typeContact.getNum();
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(id, other.id);
	}

}