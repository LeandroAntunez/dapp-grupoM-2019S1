package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;

public class Product {
    private String name;
    private Money price;
    private Category category;

    public Product(String productName, Money price, Category category) {
        this.setName(productName);
        this.setPrice(price);
        this.setCategory(category);
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
