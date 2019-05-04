package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import java.util.List;

public class WhipRound extends Event{

    private User host;
    private List<User> guestList;
    private EventCategory eventCategory;

    public WhipRound(User host, List<User> guestList, EventCategory eventCategory) {
        super(host, guestList);
        this.setEventCategory(eventCategory);
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    private void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public List<User> getGuestList() {
        return guestList;
    }

    private void setGuestList(List<User> guestList) {
        this.guestList = guestList;
    }

    public User getHost() {
        return host;
    }

    private void setHost(User host) {
        this.host = host;
    }
}
