package com.ugr.springmvc.service;

import com.ugr.springmvc.domain.Product;
import java.io.Serializable;
import java.util.List;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}