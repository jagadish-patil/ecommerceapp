package com.jp.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.ecommerce.model.Category;
import com.jp.ecommerce.repository.CategoryRepo;

@Service
public class CategoryService{
	
	@Autowired
	CategoryRepo categoryRepo;
	
	public void createCategory(Category category) {
		categoryRepo.save(category);
	}

	public List<Category> listCategory(){
		return categoryRepo.findAll();
	}
}
