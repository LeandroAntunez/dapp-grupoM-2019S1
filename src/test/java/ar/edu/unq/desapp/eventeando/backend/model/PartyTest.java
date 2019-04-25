package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class PartyTest {

    private User host;
    private User guest;
    private List<User> guestList;
    private List<User> attendees;
    private DateTime confirmationDate;

    @Before
    public void setUp(){
        host = mock(User.class);
        guest = mock(User.class);
        guestList = new ArrayList<User>();
        attendees = new ArrayList<User>();
        guestList.add(guest);
        confirmationDate = new DateTime(2019- 5- 1);
    }

    @Test
    public void PartyHasConfirmationDate(){
        Party party = new Party(host, guestList, attendees, confirmationDate);
        Assert.assertEquals(confirmationDate, party.getConfirmationDate());
    }
}
