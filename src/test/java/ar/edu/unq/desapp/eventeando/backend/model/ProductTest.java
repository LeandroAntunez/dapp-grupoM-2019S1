package ar.edu.unq.desapp.eventeando.backend.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {

    private Product product;
    private String productName;

    @Before
    public void setUp(){
        productName = "Water bottle";
    }

    @Test
    public void createdProductHasName(){
        product = new Product(productName);
        Assert.assertEquals(productName, product.getName());
    }

}
