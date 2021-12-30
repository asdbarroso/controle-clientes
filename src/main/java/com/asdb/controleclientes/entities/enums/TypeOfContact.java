package com.asdb.controleclientes.entities.enums;

public enum TypeOfContact {

	EMAIL(1), MOBILE(2), PHONE(3), FACEBOOK(4), LINKEDIN(5);

	int num;

	private TypeOfContact(Integer num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public static TypeOfContact valueOf(int num) {
		for(TypeOfContact tipo : TypeOfContact.values()) {
			if(tipo.getNum() == num) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("Type of Contact no exists");
	}

}