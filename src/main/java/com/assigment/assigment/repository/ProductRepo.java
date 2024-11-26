package com.assigment.assigment.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.assigment.assigment.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepo extends JpaRepository<Product, Long> {
  
	Page<Product> findAll(Pageable pageable);

}
