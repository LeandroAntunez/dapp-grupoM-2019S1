package ar.edu.unq.desapp.eventeando.backend.model.product;

import java.math.BigDecimal;

import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.DRINK;
import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.FOOD;

public class ProductFactory {

    public ProductFactory() {
    }

    public Product foodForOnePerson() {
        return new Product(1L, "Sandwich de Bondiola", new BigDecimal("40.00"), FOOD);
    }

    public Product drinkForOnePerson() {
        return new Product(1L, "Coca Cola", new BigDecimal("70.00"), DRINK);
    }
}