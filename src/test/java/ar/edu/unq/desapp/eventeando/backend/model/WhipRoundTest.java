package ar.edu.unq.desapp.eventeando.backend.model;

import ar.edu.unq.desapp.eventeando.backend.model.event.EventCategory;
import ar.edu.unq.desapp.eventeando.backend.model.event.WhipRound;
import ar.edu.unq.desapp.eventeando.backend.model.event.WhipRoundModality;
import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static ar.edu.unq.desapp.eventeando.backend.model.event.EventCategory.ROASTEDWITHFRIENDS;
import static ar.edu.unq.desapp.eventeando.backend.model.event.WhipRoundModality.FIRSTBUYTHENDIVIDE;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WhipRoundTest {

    private User host;
    private List<User> guestList;
    private EventCategory eventCategory;
    private WhipRoundModality firstBuyThenDivide;
    private User guest;
    private Product product;

    @Before
    public void setUp() {
        host = mock(User.class);
        guestList = new ArrayList<>();
        eventCategory = ROASTEDWITHFRIENDS;
        firstBuyThenDivide = FIRSTBUYTHENDIVIDE;
        guest = mock(User.class);
        guestList.add(guest);
        product = mock(Product.class);
        when(product.getPrice()).thenReturn(new BigDecimal("40.00"));
    }

    @Test
    public void createdWhipRoundHaveEventCategoryTest() {
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        Assert.assertEquals(whipRound.getEventCategory(), eventCategory);
    }

    @Test
    public void createdWhipRoundHaveModalityFirstBuyThenDivide() {
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        Assert.assertEquals(whipRound.getModality(), firstBuyThenDivide);
    }

    @Test
    public void createdWhipRoundHaveDividedAmount() {
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        Assert.assertEquals(whipRound.getTotalProductsAmount(), whipRound.getDividedProductsAmount());
    }

    @Test
    public void createdWhipRoundWithTwoAttendeesHaveTotalAmountOfAnProductDividedByTwo() {
        WhipRound whipRound = new WhipRound(host, guestList, eventCategory, firstBuyThenDivide);
        whipRound.confirmAttendance(guest);
        whipRound.addProduct(product);
        BigDecimal attendeesSizeToBigDecimal = new BigDecimal(whipRound.getAttendeesSize());
        BigDecimal amountProductDividedByTwo = product.getPrice().divide(attendeesSizeToBigDecimal, 2, RoundingMode.HALF_UP);
        Assert.assertEquals(amountProductDividedByTwo, whipRound.getDividedProductsAmount());
    }
}