package com.cozzo.ecommerce.backend.application;

import com.cozzo.ecommerce.backend.domain.model.Product;
import com.cozzo.ecommerce.backend.domain.port.IProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class productService {
    private final IProductRepository iProductRepository;

    public Product save (Product product){
        return this.iProductRepository.save(product);
    }

    public Iterable<Product> findAll(){
        return this.iProductRepository.findAll();
    }
    public Product findById (Integer id){
        return this.iProductRepository.findById(id);
    }
    public void  deleteByID(Integer id){
        this.iProductRepository.deleteById(id);
    }
}
