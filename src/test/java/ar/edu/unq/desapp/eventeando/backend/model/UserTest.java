package ar.edu.unq.desapp.eventeando.backend.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
	
	@Test
	public void createUserWithNameTest() {
		String userName = "Bob";
		User newUser = new User(userName, "");
		Assert.assertEquals(newUser.getName(), userName);
	}

	@Test
	public void userCreatedHaveSurname() {
		String userName = "Bob";
		String userSurname = "Smith";
		User newUser = new User(userName, userSurname);
		Assert.assertEquals(newUser.getSurname(), userSurname);
	}

}