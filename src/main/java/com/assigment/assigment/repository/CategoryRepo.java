package com.assigment.assigment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assigment.assigment.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
