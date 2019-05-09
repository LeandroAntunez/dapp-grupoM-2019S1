package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private User host;
    private List<User> guestList;
    private List<User> attendees;
    private List<Product> products;
    private Money totalProductsAmount;

    public Event(User host, List<User> guestList) {
        this.setHost(host);
        this.setGuestList(guestList);
        this.setAttendees(new ArrayList<>());
        this.setProducts(new ArrayList<>());
        this.setTotalProductsAmount(Money.parse("ARS 00.00"));
        this.getAttendees().add(host);
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.addAmount(product.getPrice());
    }

    public void inviteGuest(User guest) {
        this.guestList.add(guest);
    }

    public void confirmAttendance(User guest) {
        this.getAttendees().add(guest);
    }

    public void addAmount(Money amountOfTenArgentinePesos) {
        this.setTotalProductsAmount(this.totalProductsAmount.plus(amountOfTenArgentinePesos));
    }

    // Getters && Setters

    private void setHost(User host) {
        this.host = host;
    }

    public User getHost() {
        return host;
    }

    private void setGuestList(List<User> guestList) {
        this.guestList = guestList;
    }

    public List<User> getGuestList() {
        return guestList;
    }

    private void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public List<Product> getProducts() {
        return products;
    }

    private void setProducts(List<Product> products) {
        this.products = products;
    }

    public Money getTotalProductsAmount() {
        return totalProductsAmount;
    }

    private void setTotalProductsAmount(Money totalProductsAmount) {
        this.totalProductsAmount = totalProductsAmount;
    }

    public int getAttendeesSize() {
        return this.getAttendees().size();
    }

}