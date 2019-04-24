package ar.edu.unq.desapp.eventeando.backend.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class EventTest {

	private User host;
	private Event event;
	private User guest;
	private List<User> guestList;

	@Before
	public void setUp(){
		host = mock(User.class);
		guest = mock(User.class);
		guestList = new ArrayList<User>();
	}

	@After
	public void tearDown() {
		guestList.clear();
	}

	@Test
	public void createdEventHasHost() {
		event = new Event(host, guestList);
		Assert.assertEquals(event.getHost(), host);
	}

	@Test
	public void createdEventHasGuest() {
		guestList.add(guest);
		event = new Event(host, guestList);
		Assert.assertEquals(guestList, event.getGuestList());
	}

}
