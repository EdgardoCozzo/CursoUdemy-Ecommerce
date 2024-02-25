package com.cozzo.ecommerce.backend.application;

import com.cozzo.ecommerce.backend.domain.model.Category;
import com.cozzo.ecommerce.backend.domain.port.ICategoryRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CategoryService {
    private final ICategoryRepository iCategoryRepository;

    public Category save(Category category){
        return this.iCategoryRepository.save(category);
    }
    public Iterable<Category> findAll(){
        return this.iCategoryRepository.findAll();
    }
    public Category findById (Integer id){
        return this.iCategoryRepository.finById(id);
    }
    void deleteByID (Integer id){
        this.iCategoryRepository.deleteById(id);
    }
}
