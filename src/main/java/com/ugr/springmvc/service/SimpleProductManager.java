

package com.ugr.springmvc.service;

import com.ugr.springmvc.domain.Product;
import java.util.List;

public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID = 1L;
    
    private List<Product> products;
        
    @Override
    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
    
    /**
     *
     * @param products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
