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
    private List<User> guestList;
    private DateTime confirmationDate;

    @Before
    public void setUp(){
        host = mock(User.class);
        User guest = mock(User.class);
        guestList = new ArrayList<User>();
        guestList.add(guest);
        confirmationDate = new DateTime(2019- 5- 1);
    }

    @Test
    public void partyHasConfirmationDate(){
        Party party = new Party(host, guestList, confirmationDate);
        Assert.assertEquals(confirmationDate, party.getConfirmationDate());
    }
}
