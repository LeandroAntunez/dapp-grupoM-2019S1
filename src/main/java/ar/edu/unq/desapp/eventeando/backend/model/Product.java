package ar.edu.unq.desapp.eventeando.backend.model;

public class Product {
    private String name;

    public Product(String productName) {
        this.setName(productName);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
