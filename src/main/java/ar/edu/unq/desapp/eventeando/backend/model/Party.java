package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.time.DateTime;

import java.util.List;

public class Party extends Event {

    private DateTime confirmationDate;

    public Party(User host, List<User> guestList, List<User> attendees, DateTime confirmationDate) {
        super(host, guestList, attendees);
        this.setConfirmationDate(confirmationDate);
    }

    private void setConfirmationDate(DateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    DateTime getConfirmationDate() {
        return confirmationDate;
    }
}
