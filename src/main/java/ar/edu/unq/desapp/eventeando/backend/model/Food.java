package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;

public class Food {

    private String name;
    private int weightInMiligrams;
    private Money price;

    public Food(String name, Money price, int weightInMiligrams) {
        this.setName(name);
        this.setPrice(price);
        this.setWeightInMiligrams(weightInMiligrams);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setWeightInMiligrams(int weightInMiligrams) {
        this.weightInMiligrams = weightInMiligrams;
    }

    public int getWeightInMiligrams() {
        return weightInMiligrams;
    }

    private void setPrice(Money price) {
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }
}
