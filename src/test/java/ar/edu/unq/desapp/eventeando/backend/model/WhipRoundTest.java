package ar.edu.unq.desapp.eventeando.backend.model;

import ar.edu.unq.desapp.eventeando.backend.model.event.EventCategory;
import ar.edu.unq.desapp.eventeando.backend.model.event.WhipRound;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static ar.edu.unq.desapp.eventeando.backend.model.event.EventCategory.ROASTEDWITHFRIENDS;
import static org.mockito.Mockito.mock;

public class WhipRoundTest {

    private User host;
    private List<User> guestList;
    private EventCategory eventCategory;

    @Before
    public void setUp(){
        host = mock(User.class);
        guestList = new ArrayList<>();
        eventCategory = ROASTEDWITHFRIENDS;
    }

    @Test
    public void createdWhipRoundHaveEventCategoryTest(){
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory);
        Assert.assertEquals(whipRound.getEventCategory(), eventCategory);
    }
}
