package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import org.joda.time.DateTime;

import java.util.List;

public class Party extends Event {

    private DateTime confirmationDate;
    private CateringSupplier cateringSupplier;

    public Party(User host, List<User> guestList, DateTime confirmationDate, CateringSupplier cateringSupplier) {
        super(host, guestList);
        this.setConfirmationDate(confirmationDate);
        this.setCateringSupplier(cateringSupplier);
    }

    public void confirmAttendance(User guest){
        super.confirmAttendance(guest);
        this.getCateringSupplier().updateProductsForEachAttendees(this);
    }

    public boolean thereAreEnoughProductsForEachAttendees() {
        return this.cateringSupplier.thereAreEnoughProductsForEachAttendees(this);
    }

    // GETTERS & SETTERS

    private void setConfirmationDate(DateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public DateTime getConfirmationDate() {
        return confirmationDate;
    }

    public CateringSupplier getCateringSupplier() {
        return cateringSupplier;
    }

    private void setCateringSupplier(CateringSupplier cateringSupplier) {
        this.cateringSupplier = cateringSupplier;
    }
}