package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.ecommerce.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
