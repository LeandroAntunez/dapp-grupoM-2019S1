package ar.edu.unq.desapp.eventeando.backend.model;

import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory;
import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.DRINK;

public class ProductTest {

    private Product product;
    private String productName;
    private Money price;
    private ProductCategory productCategory;

    @Before
    public void setUp() {
        productCategory = DRINK;
        productName = "Water bottle";
        price = Money.parse("ARS 40.00");

    }

    @Test
    public void createdProductHasNameTest() {
        product = new Product(productName, price, productCategory);
        Assert.assertEquals(productName, product.getName());
    }

    @Test
    public void createdProductHasPriceTest() {
        product = new Product(productName, price, productCategory);
        Assert.assertEquals(product.getPrice(), price);
    }

    @Test
    public void createdProductHasProductCategory() {
        product = new Product(productName, price, productCategory);
        Assert.assertEquals(product.getProductCategory(), productCategory);
    }

}
