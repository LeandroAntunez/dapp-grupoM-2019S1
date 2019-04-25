package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;

public class Product {
    private String name;
    private Money price;

    public Product(String productName, Money price) {
        this.setName(productName);
        this.setPrice(price);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    private void setPrice(Money price) {
        this.price = price;
    }
}
