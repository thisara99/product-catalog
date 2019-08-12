package com.sandaradura.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandaradura.productcatalog.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
