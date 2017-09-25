

package com.ugr.springmvc.repository;

import com.ugr.springmvc.domain.Precios;
import java.util.List;

public interface ProductDao {

    public List<Precios> getProductList();

    //public void saveProduct(Precios prod);

}
