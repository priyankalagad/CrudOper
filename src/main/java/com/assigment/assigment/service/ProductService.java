package com.assigment.assigment.service;

import org.springframework.data.domain.Page;

import com.assigment.assigment.entity.Product;

public interface ProductService {

	Page<Product> getAllProducts(int page);

	Product getProductById(Long id);

	Product saveProduct(Product product);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);

}
