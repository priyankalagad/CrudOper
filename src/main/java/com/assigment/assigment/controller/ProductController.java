package com.assigment.assigment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.assigment.assigment.entity.Product;
import com.assigment.assigment.service.ProductService;

public class ProductController {
	
	 @Autowired
	    private ProductService productService;

	    @GetMapping
	    public Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page) {
	        return productService.getAllProducts(page);
	    }

	    @GetMapping("/{id}")
	    public Product getProductById(@PathVariable Long id) {
	        return productService.getProductById(id);
	    }

	    @PostMapping
	    public Product createProduct(@RequestBody Product product) {
	        return productService.saveProduct(product);
	    }

	    @PutMapping("/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
	        return productService.updateProduct(id, product);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	    }

}
