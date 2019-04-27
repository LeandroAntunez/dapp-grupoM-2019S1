package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {

    private Product product;
    private String drinkName;
    private Money price;
    private int foodWeightInMiligrams;
    private String foodName;
    private int drinkVolumeInMililiters;

    @Before
    public void setUp(){
        drinkName = "Water bottle";
        price = Money.parse("ARS 40.00");
        foodWeightInMiligrams = 1000;
        foodName = "Bread";
        drinkVolumeInMililiters = 750;
    }

    @Test
    public void createdProductHasNameTest(){
        product = new Product(drinkName, price);
        Assert.assertEquals(drinkName, product.getName());
    }

    @Test
    public void createdProductHasPriceTest(){
        product = new Product(drinkName, price);
        Assert.assertEquals(product.getPrice(), price);
    }

    @Test
    public void createdFoodProductHasWeightInMiligramsTest(){
        Food food = new Food(foodName, price, foodWeightInMiligrams);
        Assert.assertEquals(foodWeightInMiligrams, food.getWeightInMiligrams());
    }

    @Test
    public void createdDrinkProductHasVolumeInMililitersTest(){
        Drink drink = new Drink(drinkName, price, drinkVolumeInMililiters);
        Assert.assertEquals(drinkVolumeInMililiters, drink.getVolumeInMililiters());
    }

}
