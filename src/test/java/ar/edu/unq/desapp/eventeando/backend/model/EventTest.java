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
	private Money amountOfZero;
	private Money amountOfTenArgentinePesos;

	@Before
	public void setUp(){
		host = mock(User.class);
		guest = mock(User.class);
		guestList = new ArrayList<User>();
		attendees = new ArrayList<User>();
		amountOfZero = Money.parse("ARS 00.00");
		amountOfTenArgentinePesos = Money.parse("ARS 10.00");
		product = new Product("Alfajor Fulbito", amountOfTenArgentinePesos);
	}

	@After
	public void tearDown() {
		guestList.clear();
	}

	@Test
	public void createdEventHasHostTest() {
		event = new Event(host, guestList);
		Assert.assertEquals(event.getHost(), host);
	}

	@Test
	public void createdEventHasGuestTest() {
		guestList.add(guest);
		event = new Event(host, guestList);
		Assert.assertEquals(guestList, event.getGuestList());
	}

	@Test
	public void createdEventHasAttendeesTest(){
		guestList.add(guest);
		event = new Event(host, guestList);
		Assert.assertEquals(attendees, event.getAttendees());
	}

	@Test
    public void createdEventInviteAGuestTest(){
	    event = new Event(host, guestList);
	    Assert.assertFalse(event.getGuestList().contains(guest));
	    event.inviteGuest(guest);
	    Assert.assertTrue(event.getGuestList().contains(guest));
    }

    @Test
    public void createdEventHasAGuestAttendanceConfirmationTest(){
	    guestList.add(guest);
	    event = new Event(host, guestList);
	    event.confirmAttendance(guest);
	    Assert.assertTrue(event.getAttendees().contains(guest));
    }

    @Test
    public void createdEventHasAProductsListTest(){
	    event = new Event(host, guestList);
	    Assert.assertTrue(event.getProducts().isEmpty());
    }

    @Test
    public void createdEventAddProductTest(){
	    event = new Event(host, guestList);
	    event.addProduct(product);
	    Assert.assertTrue(event.getProducts().contains(product));
    }

    @Test
	public void createdEventHasAmountTest(){
		event = new Event(host, guestList);
		Assert.assertEquals(amountOfZero, event.getAmount());
	}

	@Test
	public void createdEventCanAddAmountTest(){
		event = new Event(host, guestList);
		event.addAmount(amountOfTenArgentinePesos);
		Assert.assertEquals(event.getAmount(), amountOfTenArgentinePesos);
	}

	@Test
	public void createdEventAddProductAndHisRespectiveCostIsAmountedTest(){
		event = new Event(host, guestList);
		event.addProduct(product);
		Assert.assertEquals(product.getPrice(), event.getAmount());
	}



}
