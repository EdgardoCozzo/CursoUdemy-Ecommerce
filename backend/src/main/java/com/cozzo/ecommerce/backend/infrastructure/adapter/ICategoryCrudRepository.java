package com.cozzo.ecommerce.backend.infrastructure.adapter;

import com.cozzo.ecommerce.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity,Integer> {
}
