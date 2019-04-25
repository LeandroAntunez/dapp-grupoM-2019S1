package ar.edu.unq.desapp.eventeando.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private User host;
    private List<User> guestList;
    private List<User> attendees;
    private List<Products> products;

    public Event(User host, List<User> guestList) {
        this.setHost(host);
        this.setGuestList(guestList);
        this.setAttendees(new ArrayList<User>());
        this.setProducts(new ArrayList<Products>());
    }

    // Getters && Setters

    private void setHost(User host) {
        this.host = host;
    }

    public User getHost() { return host; }

    private void setGuestList(List<User> guestList) { this.guestList = guestList; }

    public List<User> getGuestList() { return guestList; }

    private void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public void inviteGuest(User guest) { this.guestList.add(guest); }

    public void confirmAttendance(User guest) { this.getAttendees().add(guest); }

    public List<Products> getProducts() {
        return products;
    }

    private void setProducts(List<Products> products) {
        this.products = products;
    }
}