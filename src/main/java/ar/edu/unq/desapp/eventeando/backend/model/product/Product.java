package ar.edu.unq.desapp.eventeando.backend.model.product;

import org.joda.money.Money;

public class Product {
    private String name;
    private Money price;
    private ProductCategory productCategory;

    public Product(String productName, Money price, ProductCategory productCategory) {
        this.setName(productName);
        this.setPrice(price);
        this.setProductCategory(productCategory);
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    private void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
