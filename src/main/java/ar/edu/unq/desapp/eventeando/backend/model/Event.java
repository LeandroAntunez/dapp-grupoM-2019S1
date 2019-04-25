package ar.edu.unq.desapp.eventeando.backend.model;

import java.util.List;

public class Event {

    private User host;
    private List<User> guestList;
    private List<User> attendees;

    public Event(User host, List<User> guestList, List<User> attendees) {
        this.setHost(host);
        this.setGuestList(guestList);
        this.setAttendees(attendees);
    }

    // Getters && Setters

    public void setHost(User host) {
        this.host = host;
    }

    public User getHost() {
        return host;
    }

    public void setGuestList(List<User> guestList) {
        this.guestList = guestList;
    }

    public List<User> getGuestList() {
        return guestList;
    }

    public void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }

    public List<User> getAttendees() {
        return attendees;
    }
}