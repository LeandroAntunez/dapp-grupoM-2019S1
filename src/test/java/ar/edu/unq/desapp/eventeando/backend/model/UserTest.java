package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
	
	@Test
	public void createUserWithNameTest() {
		String userName = "Bob";
		User newUser = new User(userName, "", "", new DateTime());
		Assert.assertEquals(newUser.getName(), userName);
	}

	@Test
	public void userCreatedHaveSurnameTest() {
		String userSurname = "Smith";
		User newUser = new User("", userSurname, "", new DateTime());
		Assert.assertEquals(newUser.getSurname(), userSurname);
	}

	@Test
	public void userCreatedHaveEmailTest(){
		String userEmail = "bob.smith@gmail.com";
		User newUser = new User("", "", userEmail, new DateTime());
		Assert.assertEquals(newUser.getEmail(), userEmail);
	}
	
	@Test
	public void userCreatedHaveBirthdateTest() {
		DateTime userBirthdate = new DateTime(1990- 1 - 1);
		User newUser = new User("", "", "", userBirthdate);
		Assert.assertEquals(newUser.getBirthdate(), userBirthdate);
	}


}