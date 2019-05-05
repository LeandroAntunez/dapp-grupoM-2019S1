package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import org.joda.money.Money;

import java.math.RoundingMode;
import java.util.List;

public class WhipRound extends Event{

    private EventCategory eventCategory;
    private WhipRoundModality modality;
    private Money dividedAmount;

    public WhipRound(User host, List<User> guestList, EventCategory eventCategory, WhipRoundModality modality) {
        super(host, guestList);
        this.setEventCategory(eventCategory);
        this.setModality(modality);
        this.setDividedAmount(Money.parse("ARS 00.00"));
    }

    public void addProduct(Product product){
        super.addProduct(product);
        this.updateDividedAmount();
    }

    private void updateDividedAmount() {
        this.setDividedAmount(this.getAmount().dividedBy(this.getAttendees().size(), RoundingMode.HALF_UP));
    }

    // GETTERS & SETTERS

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    private void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public WhipRoundModality getModality() {
        return modality;
    }

    private void setModality(WhipRoundModality modality) {
        this.modality = modality;
    }

    public Money getDividedAmount() {
        return dividedAmount;
    }

    private void setDividedAmount(Money dividedAmount) {
        this.dividedAmount = dividedAmount;
    }
}