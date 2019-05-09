package ar.edu.unq.desapp.eventeando.backend.model.product;

import org.joda.money.Money;

import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.DRINK;
import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.FOOD;

public class ProductFactory {

    public ProductFactory() {
    }

    public Product foodForOnePerson() {
        return new Product("Sandwich de Bondiola", Money.parse("ARS 140"), FOOD);
    }

    public Product drinkForOnePerson() {
        return new Product("Coca Cola", Money.parse("ARS 70"), DRINK);
    }
}