package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory;
import ar.edu.unq.desapp.eventeando.backend.model.product.ProductFactory;

import java.util.List;

import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.DRINK;
import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.FOOD;

public class CateringSupplier {

    private ProductFactory productFactory;

    public CateringSupplier(ProductFactory productFactory) {
        this.setProductFactory(productFactory);
    }

    public void updateProductsForEachAttendees(Party party) {
        party.addProduct(productFactory.foodForOnePerson());
        party.addProduct(productFactory.drinkForOnePerson());
    }

    public boolean thereAreEnoughProductsForEachAttendees(List<Product> productList, int numberOfAttendees) {
        return this.eachAttendeeHaveEnoughProductOfCategory(productList, numberOfAttendees, DRINK) &&
                this.eachAttendeeHaveEnoughProductOfCategory(productList, numberOfAttendees, FOOD);
    }

    private boolean eachAttendeeHaveEnoughProductOfCategory(List<Product> productList, int numberOfAttendees, ProductCategory productCategory) {
        int numberOfProducts = (int) productList.stream()
                .filter(p -> p.getProductCategory().equals(productCategory)).count();

        return numberOfAttendees == numberOfProducts;
    }

    private void setProductFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

}
