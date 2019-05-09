package ar.edu.unq.desapp.eventeando.backend.model;

import ar.edu.unq.desapp.eventeando.backend.model.event.CateringSupplier;
import ar.edu.unq.desapp.eventeando.backend.model.product.ProductFactory;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unq.desapp.eventeando.backend.model.event.Party;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class PartyTest {

    private User host;
    private List<User> guestList;
    private DateTime confirmationDate;
    private User guest;
    private CateringSupplier cateringSupplier;
    private ProductFactory productFactory;

    @Before
    public void setUp() {
        host = mock(User.class);
        guest = mock(User.class);
        guestList = new ArrayList<>();
        guestList.add(guest);
        confirmationDate = new DateTime(2019 - 5 - 1);
        productFactory = new ProductFactory();
        cateringSupplier = new CateringSupplier(productFactory);
    }

    @Test
    public void partyHasConfirmationDateTest() {
        Party party = new Party(host, guestList, confirmationDate, cateringSupplier);
        Assert.assertEquals(confirmationDate, party.getConfirmationDate());
    }

    @Test
    public void partyHasAnAttendeeConfirmationFromAGuestThenUpdateProductsToPurchase() {
        Party party = new Party(host, guestList, confirmationDate, cateringSupplier);
        party.confirmAttendance(guest);
        Assert.assertTrue(party.thereAreEnoughProductsForEachAttendees());
    }
}
