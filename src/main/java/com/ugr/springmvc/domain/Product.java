
package com.ugr.springmvc.domain;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private Double price;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        
        StringBuilder buffer;
        buffer = new StringBuilder();
        buffer.append("Description: ").append(description).append(";");
        buffer.append("Price: ").append(price);
        return buffer.toString();
    }
}
