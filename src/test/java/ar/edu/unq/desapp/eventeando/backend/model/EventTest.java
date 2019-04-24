package ar.edu.unq.desapp.eventeando.backend.model;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class EventTest {
	
	@Test
	public void createdEventHasHost() {
		User host = mock(User.class);
		Event event = new Event(host);
		Assert.assertEquals(event.getHost(), host);
	}



}
