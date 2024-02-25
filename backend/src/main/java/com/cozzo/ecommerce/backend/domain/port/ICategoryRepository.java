package com.cozzo.ecommerce.backend.domain.port;

import com.cozzo.ecommerce.backend.domain.model.Category;

public interface ICategoryRepository {

    Category save(Category category);
    Iterable <Category> findAll();
    Category finById(Integer id);
    void deleteById(Integer Id);

}
