package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {

    private Product product;
    private String productName;
    private Money price;

    @Before
    public void setUp(){
        productName = "Water bottle";
        price = Money.parse("ARS 40.00");
    }

    @Test
    public void createdProductHasNameTest(){
        product = new Product(productName, price);
        Assert.assertEquals(productName, product.getName());
    }

    @Test
    public void createdProductHasPriceTest(){
        product = new Product(productName, price);
        Assert.assertEquals(product.getPrice(), price);
    }


}
