package ar.edu.unq.desapp.eventeando.backend.model.product;

import org.joda.money.Money;

public class ProductFactory {

    public ProductFactory(){
    }

    public Food foodForOnePerson() {
        return new Food("Sandwich de Bondiola", Money.parse("ARS 140"), 350);
    }

    public Drink drinkForOnePerson() {
        return new Drink("Coca Cola", Money.parse("ARS 70"), 500);
    }
}