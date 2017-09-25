
package com.ugr.springmvc.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="precios_pruebas")
public class Precios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "producto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String proveedor;
    private Double precio;
    
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    } 
    
    public String getDescripcion() {
        return proveedor;
    }
    
    public void setDescripcion(String description) {
        this.proveedor = description;
    }
    
    public Double getPrecio() {
        return precio;
    }
    
    public void setPrecio(Double price) {
        this.precio = price;
    }
    
    @Override
    public String toString() {
        
        StringBuilder buffer;
        buffer = new StringBuilder();
        buffer.append("Description: ").append(proveedor).append(";");
        buffer.append("Price: ").append(precio);
        return buffer.toString();
    }
}
