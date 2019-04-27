package ar.edu.unq.desapp.eventeando.backend.model.product;

import org.joda.money.Money;

public class Drink extends Product {

    private int volumeInMililiters;

    public Drink(String drinkName, Money price, int volumeInMililiters) {
        super(drinkName, price);
        this.setVolumeInMililiters(volumeInMililiters);
    }

    public int getVolumeInMililiters() {
        return volumeInMililiters;
    }

    private void setVolumeInMililiters(int volumeInMililiters) {
        this.volumeInMililiters = volumeInMililiters;
    }
}