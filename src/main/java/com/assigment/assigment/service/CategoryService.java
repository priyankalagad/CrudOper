package com.assigment.assigment.service;

import java.util.List;

import com.assigment.assigment.entity.Category;

public interface CategoryService {

	List<Category> getAllCategories();

	Category getCategoryById(Long id);

	Category saveCategory(Category category);

	void deleteCategory(Long id);

	Category updateCategory(Long id, Category category);

}
