package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;
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
	private List<User> attendees;
	private Product product;
	private Money amount;

	@Before
	public void setUp(){
		host = mock(User.class);
		guest = mock(User.class);
		guestList = new ArrayList<User>();
		attendees = new ArrayList<User>();
		product = mock(Product.class);
		amount = Money.parse("ARS 00.00");
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

	@Test
	public void createdEventHasAttendees(){
		guestList.add(guest);
		event = new Event(host, guestList);
		Assert.assertEquals(attendees, event.getAttendees());
	}

	@Test
    public void createdEventInviteAGuest(){
	    event = new Event(host, guestList);
	    Assert.assertFalse(event.getGuestList().contains(guest));
	    event.inviteGuest(guest);
	    Assert.assertTrue(event.getGuestList().contains(guest));
    }

    @Test
    public void createdEventHasAGuestAttendanceConfirmation(){
	    guestList.add(guest);
	    event = new Event(host, guestList);
	    event.confirmAttendance(guest);
	    Assert.assertTrue(event.getAttendees().contains(guest));
    }

    @Test
    public void createdEventHasAProductsList(){
	    event = new Event(host, guestList);
	    Assert.assertTrue(event.getProducts().isEmpty());
    }

    @Test
    public void createdEventAddProduct(){
	    event = new Event(host, guestList);
	    event.addProduct(product);
	    Assert.assertTrue(event.getProducts().contains(product));
    }

    @Test
	public void createdEventHasAmount(){
		event = new Event(host, guestList);
		Assert.assertEquals(amount, event.getAmount());
	}

}
