package ar.edu.unq.desapp.eventeando.backend.model;

public class Event {

    private User host;

    public Event(User host) {
        this.setHost(host);
    }

    public void setHost(User host) {
        this.host = host;
    }

    public User getHost() {
        return host;
    }
}