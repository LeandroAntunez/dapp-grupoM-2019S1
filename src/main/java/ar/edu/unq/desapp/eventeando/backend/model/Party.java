package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.time.DateTime;

import java.util.List;

public class Party extends Event {

    private DateTime confirmationDate;

    public Party(User host, List<User> guestList, List<User> attendees, DateTime confirmationDate) {
        super(host, guestList, attendees);
        this.setConfirmationDate(confirmationDate);
    }

    public void setConfirmationDate(DateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public DateTime getConfirmationDate() {
        return confirmationDate;
    }
}
