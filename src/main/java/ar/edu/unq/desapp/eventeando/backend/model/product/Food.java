package ar.edu.unq.desapp.eventeando.backend.model.product;

import org.joda.money.Money;

public class Food extends Product {

    private int weightInMiligrams;

    public Food(String name, Money price, int weightInMiligrams) {
        super(name, price);
        this.setWeightInMiligrams(weightInMiligrams);
    }

    private void setWeightInMiligrams(int weightInMiligrams) {
        this.weightInMiligrams = weightInMiligrams;
    }

    public int getWeightInMiligrams() {
        return weightInMiligrams;
    }
}
