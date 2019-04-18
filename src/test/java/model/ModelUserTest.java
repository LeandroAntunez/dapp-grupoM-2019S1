package model;

import org.junit.Assert;
import org.junit.Test;
import model.User;

public class ModelUserTest {
	
	@Test
	public void createUserWithNameTest() {
		String userName = "Bob";
		User newUser = new User("Bob");
		Assert.assertEquals(newUser.getName(), userName);
	}
}
