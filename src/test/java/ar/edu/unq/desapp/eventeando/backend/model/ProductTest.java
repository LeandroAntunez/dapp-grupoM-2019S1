package ar.edu.unq.desapp.eventeando.backend.model;

import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static ar.edu.unq.desapp.eventeando.backend.model.product.ProductCategory.DRINK;

public class ProductTest {

    private Product product;
    private String productName;
    private BigDecimal price;
    private ProductCategory productCategory;
    private Long productID;

    @Before
    public void setUp() {
        productCategory = DRINK;
        productName = "Water bottle";
        price = new BigDecimal("40.00");
        productID = 1L;
    }

    @Test
    public void createdProductHasNameTest() {
        product = new Product(productID, productName, price, productCategory);
        Assert.assertEquals(productName, product.getName());
    }

    @Test
    public void createdProductHasPriceTest() {
        product = new Product(productID, productName, price, productCategory);
        Assert.assertEquals(product.getPrice(), price);
    }

    @Test
    public void createdProductHasProductCategory() {
        product = new Product(productID, productName, price, productCategory);
        Assert.assertEquals(product.getProductCategory(), productCategory);
    }

}
