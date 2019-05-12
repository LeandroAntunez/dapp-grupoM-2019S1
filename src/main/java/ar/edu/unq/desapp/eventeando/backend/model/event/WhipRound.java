package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class WhipRound extends Event {

    private EventCategory eventCategory;
    private WhipRoundModality modality;
    private BigDecimal dividedProductsAmount;

    public WhipRound(User host, List<User> guestList, EventCategory eventCategory, WhipRoundModality modality) {
        super(host, guestList);
        this.setEventCategory(eventCategory);
        this.setModality(modality);
        this.setDividedProductsAmount(new BigDecimal("00.00"));
    }

    public void addProduct(Product product) {
        super.addProduct(product);
        this.updateDividedAmount();
    }

    private void updateDividedAmount() {
        BigDecimal attendeesSizeToBigDecimal = new BigDecimal(this.getAttendeesSize());
        BigDecimal result = this.getTotalProductsAmount().divide(attendeesSizeToBigDecimal, 2, RoundingMode.HALF_UP);
        this.setDividedProductsAmount(result);
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

    public BigDecimal getDividedProductsAmount() {
        return dividedProductsAmount;
    }

    private void setDividedProductsAmount(BigDecimal dividedProductsAmount) {
        this.dividedProductsAmount = dividedProductsAmount;
    }
}