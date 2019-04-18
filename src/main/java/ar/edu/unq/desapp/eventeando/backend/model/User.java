package ar.edu.unq.desapp.eventeando.backend.model;

public class User {

	private String name;
	private String surname;
	private String email;

	public User(String name, String surname, String email) {
		this.setName(name);
		this.setSurname(surname);
		this.setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}