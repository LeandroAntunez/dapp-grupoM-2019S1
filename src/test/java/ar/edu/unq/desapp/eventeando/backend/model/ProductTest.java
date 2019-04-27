package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {

    private Product product;
    private String productName;
    private Money price;
    private Category foodCategory;
    private Category drinkCategory;

    @Before
    public void setUp(){
        productName = "Water bottle";
        price = Money.parse("ARS 40.00");
        foodCategory = Category.FOOD;
        drinkCategory = Category.DRINK;
    }

    @Test
    public void createdProductHasNameTest(){
        product = new Product(productName, price, foodCategory);
        Assert.assertEquals(productName, product.getName());
    }

    @Test
    public void createdProductHasPriceTest(){
        product = new Product(productName, price, foodCategory);
        Assert.assertEquals(product.getPrice(), price);
    }

    @Test
    public void createdProductHasFoodCategoryTest(){
        product = new Product(productName, price, foodCategory);
        Assert.assertEquals(foodCategory, product.getCategory());
    }

    @Test
    public void createdProductHasDrinkCategory(){
        product = new Product(productName, price, drinkCategory);
        Assert.assertEquals(drinkCategory, product.getCategory());
    }


}
