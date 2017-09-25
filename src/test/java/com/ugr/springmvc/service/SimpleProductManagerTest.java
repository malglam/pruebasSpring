/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugr.springmvc.service;

import com.ugr.springmvc.domain.Precios;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author clopez
 */
public class SimpleProductManagerTest {
    
    private SimpleProductManager productManager;
    
    private List<Precios> products;
    
    private static int PRODUCT_COUNT = 2;
    
    private static Double CHAIR_PRICE = new Double(2.1216);
    private static String CHAIR_DESCRIPTION = "24232388W";
    
    private static String TABLE_DESCRIPTION = "24232388W";
    private static Double TABLE_PRICE = new Double(0.988); 
    
    @Before
    public void setUp() throws Exception {
        productManager = new SimpleProductManager();
        products = new ArrayList<Precios>();
        
        // stub up a list of products
        Precios product = new Precios();
        product.setDescripcion("24232388W");
        product.setPrecio(CHAIR_PRICE);
        products.add(product);
        
        product = new Precios();
        product.setDescripcion("24232388W");
        product.setPrecio(TABLE_PRICE);
        products.add(product);
        
        productManager.setProducts(products);

    }

    @Test
    public void testGetProductsWithNoProducts() {
        productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }

    @Test
    public void testGetProducts() {
        List<Precios> products = productManager.getProducts();
        assertNotNull(products);        
        assertEquals(PRODUCT_COUNT, productManager.getProducts().size());
    
        Precios product = products.get(0);
        assertEquals(CHAIR_DESCRIPTION, product.getDescripcion());
        assertEquals(CHAIR_PRICE, product.getPrecio());
        
        product = products.get(1);
        assertEquals(TABLE_DESCRIPTION, product.getDescripcion());
        assertEquals(TABLE_PRICE, product.getPrecio());      
    }
    
}
