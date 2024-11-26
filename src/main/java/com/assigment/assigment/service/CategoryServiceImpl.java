package com.assigment.assigment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assigment.assigment.entity.Category;
import com.assigment.assigment.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
    private CategoryRepo categoryRepository;
	
	@Override
	public List<Category> getAllCategories() {
		 return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(Long id) {
		 return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public Category saveCategory(Category category) {
		 return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		  categoryRepository.deleteById(id);
		
	}

	@Override
	public Category updateCategory(Long id, Category updatedCategory) {
		 Category category = getCategoryById(id);
	        category.setName(updatedCategory.getName());
	        category.setDescription(updatedCategory.getDescription());
	        return categoryRepository.save(category);
	}

}
