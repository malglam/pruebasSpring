

package com.ugr.springmvc.service;

import com.ugr.springmvc.domain.Precios;
import java.util.List;

public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID = 1L;
    
    private List<Precios> products;
        
    @Override
    public void increasePrice(int percentage) {
        if (products != null) {
            for (Precios product : products) {
                double newPrice = product.getPrecio() * 
                                    (100 + percentage)/100;
                product.setPrecio(newPrice);
            }
        }
    }

    @Override
    public List<Precios> getProducts() {
        return products;
    }
    
    /**
     *
     * @param products
     */
    public void setProducts(List<Precios> products) {
        this.products = products;
    }

}
