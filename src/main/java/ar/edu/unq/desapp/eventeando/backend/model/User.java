package ar.edu.unq.desapp.eventeando.backend.model;

public class User {

	private String name;
	private String surname;

	public User(String name, String surname) {
		this.setName(name);
		this.setSurname(surname);
	}
	
	
	// GETTERS & SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
