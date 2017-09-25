/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugr.springmvc.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clopez
 */
public class ProductTest {
    
    private Precios product;

    @Before
    public void setUp() throws Exception {
        product = new Precios();
    }

    @Test
    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescripcion());
        product.setDescripcion(testDescription);
        assertEquals(testDescription, product.getDescripcion());
    }

    @Test
    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);    
        product.setPrecio(testPrice);
        assertEquals(testPrice, product.getPrecio(), 0);
    }
    
}
