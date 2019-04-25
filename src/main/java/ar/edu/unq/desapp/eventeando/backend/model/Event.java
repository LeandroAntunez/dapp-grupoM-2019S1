package ar.edu.unq.desapp.eventeando.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private User host;
    private List<User> guestList;
    private List<User> attendees;

    public Event(User host, List<User> guestList) {
        this.setHost(host);
        this.setGuestList(guestList);
        this.setAttendees(new ArrayList<User>());
    }

    // Getters && Setters

    private void setHost(User host) {
        this.host = host;
    }

    User getHost() { return host; }

    private void setGuestList(List<User> guestList) { this.guestList = guestList; }

    List<User> getGuestList() { return guestList; }

    private void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }

    List<User> getAttendees() {
        return attendees;
    }

    void inviteGuest(User guest) { this.guestList.add(guest); }
}