package ar.edu.unq.desapp.eventeando.backend.model.event;

import ar.edu.unq.desapp.eventeando.backend.model.product.Drink;
import ar.edu.unq.desapp.eventeando.backend.model.product.Food;
import ar.edu.unq.desapp.eventeando.backend.model.product.ProductFactory;

public class CateringSupplier {

    private ProductFactory productFactory;

    public CateringSupplier(ProductFactory productFactory){
        this.setProductFactory(productFactory);
    }

    public void updateProductsForEachAttendees(Party party) {
        party.addProduct(productFactory.foodForOnePerson());
        party.addProduct(productFactory.drinkForOnePerson());
    }

    private void setProductFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    public boolean thereAreEnoughProductsForEachAttendees(Party party) {
        return this.thereAreEnoughDrinkForEachAttendee(party) &&
                this.thereAreEnoughFoodForEachAttendee(party);
    }

    private boolean thereAreEnoughFoodForEachAttendee(Party party) {
        int numberOfAttendees = party.getAttendees().size();
        int numberOfFood = (int) party.getProducts().stream().filter(product -> product instanceof Food).count();
        return numberOfAttendees == numberOfFood;
    }

    private boolean thereAreEnoughDrinkForEachAttendee(Party party) {
        int numberOfAttendees = party.getAttendees().size();
        int numberOfDrinks = (int) party.getProducts().stream().filter(product -> product instanceof Drink).count();
        return numberOfAttendees == numberOfDrinks;
    }
}
