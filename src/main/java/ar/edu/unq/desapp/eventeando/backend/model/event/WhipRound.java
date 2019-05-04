package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import java.util.List;

public class WhipRound extends Event{

    private EventCategory eventCategory;
    private WhipRoundModality modality;

    public WhipRound(User host, List<User> guestList, EventCategory eventCategory, WhipRoundModality modality) {
        super(host, guestList);
        this.setEventCategory(eventCategory);
        this.setModality(modality);
    }

    // GETTERS & SETTERS

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    private void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public WhipRoundModality getModality() {
        return modality;
    }

    private void setModality(WhipRoundModality modality) {
        this.modality = modality;
    }
}