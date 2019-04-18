package ar.edu.unq.desapp.eventeando.backend.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
	
	@Test
	public void createUserWithNameTest() {
		String userName = "Bob";
		User newUser = new User(userName, "", "");
		Assert.assertEquals(newUser.getName(), userName);
	}

	@Test
	public void userCreatedHaveSurname() {
		String userSurname = "Smith";
		User newUser = new User("", userSurname, "");
		Assert.assertEquals(newUser.getSurname(), userSurname);
	}

	@Test
	public void userCreatedHaveEmail(){
		String userEmail = "bob.smith@gmail.com";
		User newUser = new User("", "", userEmail);
		Assert.assertEquals(newUser.getEmail(), userEmail);
	}

}