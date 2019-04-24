package ar.edu.unq.desapp.eventeando.backend.model;

import java.util.List;

public class Event {

    private User host;
    private List<User> guestList;

    public Event(User host, List<User> guestList) {
        this.setHost(host);
        this.setGuestList(guestList);
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
}