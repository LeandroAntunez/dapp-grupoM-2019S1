package ar.edu.unq.desapp.eventeando.backend.model.event;

import org.joda.time.DateTime;

import ar.edu.unq.desapp.eventeando.backend.model.User;

import java.util.List;

public class Party extends Event {

    private DateTime confirmationDate;

    public Party(User host, List<User> guestList, DateTime confirmationDate) {
        super(host, guestList);
        this.setConfirmationDate(confirmationDate);
    }

    private void setConfirmationDate(DateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public DateTime getConfirmationDate() {
        return confirmationDate;
    }
}
