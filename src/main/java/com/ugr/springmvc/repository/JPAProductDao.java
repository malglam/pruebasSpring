

package com.ugr.springmvc.repository;

import com.ugr.springmvc.domain.Precios;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository(value = "productDao")
public class JPAProductDao implements ProductDao {

    private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    @Override
    public List<Precios> getProductList() {
        return em.createQuery("select  p from Precios p order by p.id").getResultList();
    }

    /*@Transactional(readOnly = false)
    @Override
    public void saveProduct(Precios prod) {
        em.merge(prod);
    }*/

}
