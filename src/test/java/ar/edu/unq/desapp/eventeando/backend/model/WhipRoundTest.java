package ar.edu.unq.desapp.eventeando.backend.model;

import ar.edu.unq.desapp.eventeando.backend.model.event.EventCategory;
import ar.edu.unq.desapp.eventeando.backend.model.event.WhipRound;
import ar.edu.unq.desapp.eventeando.backend.model.event.WhipRoundModality;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static ar.edu.unq.desapp.eventeando.backend.model.event.EventCategory.ROASTEDWITHFRIENDS;
import static ar.edu.unq.desapp.eventeando.backend.model.event.WhipRoundModality.FIRSTBUYTHENDIVIDE;
import static org.mockito.Mockito.mock;

public class WhipRoundTest {

    private User host;
    private List<User> guestList;
    private EventCategory eventCategory;
    private WhipRoundModality firstBuyThenDivide;

    @Before
    public void setUp(){
        host = mock(User.class);
        guestList = new ArrayList<>();
        eventCategory = ROASTEDWITHFRIENDS;
        firstBuyThenDivide = FIRSTBUYTHENDIVIDE;
    }

    @Test
    public void createdWhipRoundHaveEventCategoryTest(){
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        Assert.assertEquals(whipRound.getEventCategory(), eventCategory);
    }

    @Test
    public void createdWhipRoundHaveModalityFirstBuyThenDivide(){
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        Assert.assertEquals(whipRound.getModality(), firstBuyThenDivide);
    }

    @Test
    public void createdWhipRoundHaveDividedAmount(){
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        Assert.assertEquals(whipRound.getAmount(), whipRound.getDividedAmount());
    }
}