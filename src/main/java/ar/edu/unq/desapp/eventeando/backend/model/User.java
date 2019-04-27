package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.time.DateTime;

public class User {

	private String name;
	private String surname;
	private String email;
	private DateTime birthdate;

	public User(String name, String surname, String userEmail, DateTime userBirthdate) {
		this.setName(name);
		this.setSurname(surname);
		this.setEmail(userEmail);
		this.setBirthdate(userBirthdate);
	}
	
	// GETTERS & SETTERS

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public DateTime getBirthdate() { return birthdate; }

	private void setBirthdate(DateTime userBirthdate) {
		this.birthdate = userBirthdate;
	}
}